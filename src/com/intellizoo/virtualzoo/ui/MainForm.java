package com.intellizoo.virtualzoo.ui;
/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : MainForm.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/29/17
 */

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.AnimalMoveEventListener;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.Road;
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTextArea;
import javax.swing.JTextPane;

/**
 * Kelas form utama dari tampilan program.
 *
 * @author Jonathan Christopher
 */
public class MainForm implements AnimalMoveEventListener {

  private Zoo zoo = null;
  private JPanel mainPanel;
  private JScrollPane zooScrollPane;
  private JPanel bottomPanel;
  private JButton loadButton;
  private JButton foodConsumptionButton;
  private ZooDisplay zooDisplay;
  private JSplitPane mainSplitPane;
  private JScrollPane interactionScrollPane;
  private JButton tourButton;
  private JTextArea interactionTextArea;

  /**
   * Konstruktor dari MainForm; mendaftarkan penanganan event untuk komponen-komponen di dalamnya.
   */
  public MainForm() {
    foodConsumptionButton.addActionListener(new ActionListener() {
      /**
       * Menangani aksi penekanan tombol konsumsi makanan.
       * @param e Parameter aksi event.
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(
            mainPanel,
            "Kebutuhan makanan per hari:\n"
                + "Daging: " + zoo.calculateTotalMeat() + " kg \n"
                + "Sayur: " + zoo.calculateTotalVegetable() + " kg \n"
        );
      }
    });

    loadButton.addActionListener(new ActionListener() {
      /**
       * Menangani aksi penekanan tombol buka dari file.
       * @param e Parameter aksi event.
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        JFileChooser fileChooser = new JFileChooser();
        int fileChooserReturnValue = fileChooser.showDialog(mainPanel, "Load");
        if (fileChooserReturnValue == JFileChooser.APPROVE_OPTION) {
          File inputFile = fileChooser.getSelectedFile();
          Zoo openedZoo = null;
          try {
            Scanner scanner = new Scanner(inputFile);
            openedZoo = new Zoo(scanner);
            scanner.close();
            setZoo(openedZoo);
          } catch (Exception exception) {
            JOptionPane.showMessageDialog(mainPanel, "File input gagal dibuka.");
          }
        }
      }
    });

    tourButton.addActionListener(new ActionListener() {
      /**
       * Menangani penekanan tombol tur kebun binatang; memulai tur.
       * @param e Parameter aksi event.
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        tourZoo();
      }
    });
  }

  public Zoo getZoo() {
    return zoo;
  }

  /**
   * Mengaitkan zoo yang diberikan dengan tampilan pada form ini, dan juga mendaftarkan penanganan
   * event-event untuk isi Zoo.
   * @param zoo Zoo yang akan dikaitkan dengan tampilan di form ini.
   */
  public void setZoo(Zoo zoo) {
    terminateBehaviorThreads();

    this.zoo = zoo;
    zooDisplay.setZoo(zoo);

    // Daftarkan event listener untuk event hewan bergerak
    List<Zone> zones = zoo.getZones();
    for (Zone cage : zones) {
      if (cage instanceof Cage) {
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          animal.removeAnimalMoveEventListener(this);
          animal.addAnimalMoveEventListener(this);
        }
      }
    }

    zooDisplay.revalidate();
    startBehaviorThreads();
  }

  /**
   * Mulai thread-thread pada Zoo ini yang menangani perilaku isi Zoo.
   */
  public void startBehaviorThreads() {
    if (zoo != null) {
      zoo.startBehaviorThreads();
    }
  }

  /**
   * Hentikan thread-thread pada Zoo ini yang menangani perilaku isi Zoo.
   */
  public void terminateBehaviorThreads() {
    if (zoo != null) {
      zoo.terminateBehaviorThreads();
    }
  }

  public JPanel getMainPanel() {
    return mainPanel;
  }

  /**
   * Event listener yang akan dipanggil ketika sebuah objek Animal yang sudah mendaftarkan objek ini
   * bergerak.
   *
   * @param eventSource Objek Animal yang bergerak.
   * @param oldPosition Posisi objek Animal sebelum bergerak.
   */
  @Override
  public void onAnimalMove(Animal eventSource, Point oldPosition) {
    zooDisplay.repaint();
  }

  /**
   * Melakukan tour keliling kebun binatang.
   *
   * <p>Memilih salah satu jalan masuk (Entrance) secara acak dan
   * menampilkan serangkaian experience yang dialami pengunjung.
   * Experience yang dirasakan berdasarkan interaksi dengan hewan-hewan yang
   * ada di setiap Cage yang bersinggungan dengan current Cell.
   * Pemilihan jalan tour dilakukan dengan memilih next Cell bertipe Road
   * yang bersinggungan dengan current Cell yang belum pernah
   * dikunjungi sebelumnya. Jika ada lebih dari satu Cell bertipe Road yang
   * dapat dipilih, pemilihan dilakukan secara acak.
   * Penulusuran akan berhenti saat sudah tidak ada lagi Road yang dapat
   * dipilih, atau telah mencapai jalan keluar (Exit).
   */
  public void tourZoo() {
    List<Cell> arr = zoo.getCells();
    interactionTextArea.append("\nStarting tour...\n");

    int [][] isAccessible = new int[zoo.getRows()][zoo.getCols()];
    for (int i = 0; i < zoo.getRows(); i++) {
      for (int j = 0; j < zoo.getCols(); j++) {
        isAccessible[i][j] = 0;
      }
    }

    List<Road> entrances = new ArrayList<>();
    for (Cell road : arr) {
      if (road instanceof Road) {
        isAccessible[road.getPosition().getRow()][road.getPosition().getCol()] = 1;
        if (((Road) road).isEntrance()) {
          entrances.add((Road) road);
        } else if (((Road) road).isExit()) {
          isAccessible[road.getPosition().getRow()][road.getPosition().getCol()] = 2;
        }
      }
    }
    if (entrances.isEmpty()) {
      interactionTextArea.append("No entrance found.\n");
    }

    Random rand = new Random();
    int numOfEntrances = rand.nextInt(entrances.size());
    Point start = entrances.get(numOfEntrances).getPosition();
    boolean pathExist;
    int currDirection;
    boolean [] direction = new boolean[4];
    do {
      pathExist = false;
      direction[0] = false;
      direction[1] = false;
      direction[2] = false;
      direction[3] = false;

      interactionTextArea.append("Current position: (" + start.getRow() + "," + start.getCol() + ")\n");
      interactionTextArea.append(zoo.listNeighboringInteractions(start) + "\n");

      currDirection = rand.nextInt(4);
      isAccessible[start.getRow()][start.getCol()] = 0;
      if (start.getRow() + 1 < zoo.getRows()
          && ((isAccessible[start.getRow() + 1][start.getCol()] == 1)
          || (isAccessible[start.getRow() + 1][start.getCol()] == 2))) {
        direction[2] = true;
      }
      if (start.getRow() - 1 >= 0
          && ((isAccessible[start.getRow() - 1][start.getCol()] == 1)
          || (isAccessible[start.getRow() - 1][start.getCol()] == 2))) {
        direction[0] = true;
      }
      if (start.getCol() - 1 >= 0
          && ((isAccessible[start.getRow()][start.getCol() - 1] == 1)
          || (isAccessible[start.getRow()][start.getCol() - 1] == 2))) {
        direction[3] = true;
      }
      if (start.getCol() + 1 < zoo.getCols()
          && ((isAccessible[start.getRow()][start.getCol() + 1] == 1)
          || (isAccessible[start.getRow()][start.getCol() + 1] == 2))) {
        direction[1] = true;
      }
      for (int i = 0; i < 4; i++) {
        pathExist |= direction[i];
      }
      if (pathExist) {
        do {
          currDirection = rand.nextInt(4);
        } while (!direction[currDirection]);
        switch (currDirection) {
          case 0:
            start = start.translate(new Point(-1, 0));
            break;
          case 1:
            start = start.translate(new Point(0, 1));
            break;
          case 2:
            start = start.translate(new Point(1, 0));
            break;
          case 3:
            start = start.translate(new Point(0, -1));
            break;
          default:
        }
      }
    } while (pathExist && isAccessible[start.getRow()][start.getCol()] != 2);

    interactionTextArea.append("\n");
  }
}
