package com.intellizoo.virtualzoo.zoo.cell.restaurant;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

// Nama file         : Restaurant.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas restaurant yang merepesentasikan fasilitas yang berupa restoran.
 */
public class Restaurant extends Cell {
  /**
   * Menciptakan sebuah restoran dengan status aksesibilitas tertentu pada posisi tertentu.
   * @param position Posisi dari restoran.
   * @param accessible Status aksesibilitas restoran.
   */
  public Restaurant(Point position, boolean accessible) {
    super(position, accessible);
  }

  /**
   * Mengembalikan representasi teks restoran.
   * @return Sebuah karakter yang merupakan representasi teks restoran.
   */
  public char render() {
    return 'r';
  }
};