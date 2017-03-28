package com.intellizoo.virtualzoo.renderer;

import com.intellizoo.virtualzoo.Point;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.AnimalTest.java
 * Tanggal dibuat    : 26/03/2017
 * Tanggal perubahan : 26/03/2017
 */

/**
 * Interface Renderable yang merepresentasikan perilaku objek yang dapat digambar di atas layar.
 *
 * @author Alvin Sullivan
 */
public interface Renderable {

  /**
   * Mengembalikan satu karakter yang merepesentasikan bentuk objek yang bersangkutan di atas
   * console teks.
   *
   * @return Karakter yang merepresentasikan bentuk objek yang bersangkutan.
   */
  char render();

  /**
   * Mengembalikan posisi untuk pencetakan objek.
   *
   * @return Posisi dari objek yang akan dicetak.
   */
  Point getPosition();
}
