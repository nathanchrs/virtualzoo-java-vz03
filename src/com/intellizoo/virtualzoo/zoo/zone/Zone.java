package com.intellizoo.virtualzoo.zoo.zone;

import com.intellizoo.virtualzoo.zoo.cell.Cell;
import java.util.ArrayList;
import java.util.List;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Zone.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

/**
 * Kelas Zone yang merepresentasikan zona kumpulan cell.
 *
 * @author Alvin Sullivan
 */
public class Zone {

  private String name;
  private List<Cell> cells = new ArrayList<>();

  public Zone(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }

  public List<Cell> getCells() {
    return cells;
  }

  /**
   * Menambahkan sebuah petak ke dalam zona ini.
   *
   * @param cell Petak yang akan ditambahkan.
   */
  public void addCell(Cell cell) {
    cells.add(cell);
  }

  /**
   * Mengembalikan banyaknya petak dalam zona ini.
   *
   * @return Jumlah petak dalam zona ini.
   */
  public int size() {
    return cells.size();
  }

};