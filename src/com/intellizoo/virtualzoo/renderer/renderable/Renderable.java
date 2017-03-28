package com.intellizoo.virtualzoo.renderer.renderable;
import com.intellizoo.virtualzoo.renderer.point.Point;

// Nama file         : Renderable.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Interface Renderable yang merepresentasikan perilaku objek yang dapat
 * digambar di atas layar.
 * @author Alvin Sullivan
 */
public interface Renderable {
  /**
   * Mengembalikan satu karakter yang merepesentasikan bentuk objek
   * yang bersangkutan di atas console teks.
   * @return Karakter yang merepresentasikan bentuk objek yang bersangkutan.
   */
  public char render();

  /**
   * Mengembalikan posisi untuk pencetakan objek.
   * @return Posisi dari objek yang akan dicetak.
   */
  public Point getPosition();
}
