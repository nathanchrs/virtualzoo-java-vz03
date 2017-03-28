package com.intellizoo.virtualzoo.renderer;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.Zoo;

// Nama file         : Renderer.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Interface Renderer yang berfungsi untuk menggambar objek.
 * @author Jordhy Fernando
 */
public interface Renderer {
  /**
   * Menggambar sebuah kebun binatang.
   * @param zoo Kebun binatang yang akan digambarkan.
   * @param topLeft Batas kiri atas peta yang akan digambar (r1, c1).
   * @param bottomRight Batas kanan bawah peta yang akan digambar (r2, c2).
   * @param useColor Jika true, output tampilan berwarna.
   */
  public void render(Zoo zoo, Point topLeft, Point bottomRight, boolean useColor);
}

