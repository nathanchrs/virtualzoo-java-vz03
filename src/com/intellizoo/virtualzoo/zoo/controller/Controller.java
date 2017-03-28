package com.intellizoo.virtualzoo.zoo.controller;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.Road;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

// Nama file         : Controller.java
// Tanggal dibuat    : 28/03/2017
// Tanggal perubahan : 28/03/2017

/**
 * Kelas Controller yang berfungsi untuk menjalankan fitur-fitur pada zoo.
 *
 * @author Jordhy Fernando
 */
public class Controller {

  private Zoo zoo;
  private boolean useColor;


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
    List<Road> entrances = new ArrayList<Road>();
    List<Cell> arr = zoo.getCells();
    int [][] isAccessible = new int[zoo.getRows()][zoo.getCols()];
    for (int i = 0; i < zoo.getRows(); i++) {
      for (int j = 0; j < zoo.getCols(); j++) {
        isAccessible[i][j] = 0;
      }
    }

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
      System.out.println("Current Position" + start.getRow() + " " + start.getCol());
      System.out.print(zoo.listNeighboringInteractions(start));
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

    System.out.print("Input [back] to return to menu: ");
    Scanner reader = new Scanner(System.in);
    String input;
    do {
      input = reader.next();
    } while (!input.equals("back"));
  }

}
