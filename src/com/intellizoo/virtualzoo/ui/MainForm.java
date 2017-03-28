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
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

/**
 * Kelas form utama dari tampilan program.
 *
 * @author Jonathan Christopher
 */
public class MainForm implements AnimalMoveEventListener {

  private Zoo zoo = null;
  private JPanel MainPanel;
  private JScrollPane ZooScrollPane;
  private JPanel BottomPanel;
  private JButton LoadButton;
  private JButton FoodConsumptionButton;
  private ZooDisplay ZooDisplay;
  private JList InteractionsList;

  public MainForm() {
    FoodConsumptionButton.addActionListener(new ActionListener() {
      /**
       * Menangani aksi penekanan tombol keperluan makanan.
       */
      @Override
      public void actionPerformed(ActionEvent e) {
        JOptionPane.showMessageDialog(null, "Kebutuhan makanan per hari: \n 111");
      }
    });
  }

  public Zoo getZoo() {
    return zoo;
  }

  public void setZoo(Zoo zoo) {
    terminateBehaviorThreads();

    this.zoo = zoo;
    ZooDisplay.setZoo(zoo);

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
    return MainPanel;
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
    ZooDisplay.repaint();
  }
}
