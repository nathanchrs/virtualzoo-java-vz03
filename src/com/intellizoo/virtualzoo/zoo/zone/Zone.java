package com.intellizoo.virtualzoo.zoo.zone;

import com.intellizoo.virtualzoo.zoo.cell.Cell;
import java.util.List;

// Nama file         : Zone.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Zone yang merepresentasikan zona kumpulan cell.
 * @author Alvin Sullivan
 */
public abstract class Zone {

  private String name;
  private List<Cell> cells;

  /**
   * @param name Nama zona.
   * @brief Constructor.
   * @details Menciptakan kelas zona yang menyimpan daftar petak-petak dalam zoo.
   */
  public Zone(String name) {
    this.name = name;
  }

  /**
   * @param cell Pointer ke Cell yang akan ditambah.
   * @brief Mendaftarkan petak ke zona ini.
   */
  public abstract void AddCell(Cell[] cell) {
    cells.add(cell);
  }

  //Getter & Setter
  public String GetName() {
    return name;
  }

  public void SetName(String name) {
    this.name = name;
  }

  public Cell[] GetCells() {
    return cells;
  }

  /**
   * @return Jumlah petak yang terdaftar dalam zona ini.
   * @brief Mengembalikan jumlah petak yang terdaftar dalam zona ini.
   */
  public int Size() {
    return cells.size();
  }

};