package com.intellizoo.virtualzoo.zoo.cell.road;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

// Nama file         : Road.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas road yang merepresentasikan fasilitas yang berupa jalan.
 * @author Alvin Sullivan
 */
public class Road extends Cell {
  private boolean entrance;
  private boolean exit;

  /**
   * Menciptakan sebuah jalan dengan status aksesibilitas tertentu pada posisi tertentu.
   *
   * <p>Jalan dapat berupa jalan biasa, jalan masuk, atau jalan keluar.
   * @param position Posisi dari jalan.
   * @param accessible Status aksesibilitas jalan.
   * @param entrance true jika jalan adalah jalan masuk, false jika tidak.
   * @param exit true jika jalan adalah jalan keluar, false jika tidak..
   */
  public Road(Point position, boolean accessible, boolean entrance, boolean exit) {
    super(position, accessible);
    this.entrance = entrance;
    this.exit = exit;
  }

  // Getter & Setter
  public boolean isEntrance() {
    return entrance;
  }

  public void setEntrance(boolean entrance) {
    this.entrance = entrance;
  }

  public boolean isExit() {
    return exit;
  }

  public void setExit(boolean exit) {
    this.exit = exit;
  }

  /**
   * Mengembalikan representasi teks jalan.
   * @return Sebuah karakter yang merupakan representasi teks jalan.
   */
  public char render() {
    return '.';
  }
}