package com.intellizoo.virtualzoo.zoo.animal;
/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : AnimalMoveEventListener.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import com.intellizoo.virtualzoo.point.Point;

/**
 * Observer dari event Move pada Animal.
 */
public interface AnimalMoveEventListener {

  /**
   * Event listener yang akan dipanggil ketika sebuah objek Animal yang sudah mendaftarkan objek ini
   * bergerak.
   *
   * @param eventSource Objek Animal yang bergerak.
   * @param oldPosition Posisi objek Animal sebelum bergerak.
   */
  void onAnimalMove(Animal eventSource, Point oldPosition);
}
