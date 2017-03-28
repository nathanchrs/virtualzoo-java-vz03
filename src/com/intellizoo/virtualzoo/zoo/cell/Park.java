package com.intellizoo.virtualzoo.zoo.cell;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

// Nama file         : Park.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas park yang merepesentasikan fasilitas yang berupa taman.
 * @author Alvin Sullivan
 */
public class Park extends Cell {
  /**
   * Menciptakan sebuah taman dengan status aksesibilitas tertentu pada posisi tertentu.
   * @param position Posisi dari taman.
   * @param accessible Status aksesibilitas taman.
   */
  public Park(Point position, boolean accessible) {
    super(position, accessible);
  }

  /**
   * Mengembalikan representasi teks taman.
   * @return Sebuah karakter yang merupakan representasi teks taman.
   */
  public char render() {
    return 'p';
  }
}