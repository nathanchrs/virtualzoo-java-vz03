package com.intellizoo.virtualzoo.zoo.cell;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.renderable.Renderable;

// Nama file         : Cell.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas abstrak cell yang merepesentasikan sebuah petak tanah.
 * @author Alvin Sullivan
 */
public abstract class Cell implements Renderable {
  private Point position;
  private boolean accessible;

  /**
   * Menciptakan sebuah cell dengan posisi dan status aksesibilitas tertentu.
   * @param position Posisi dari cell.
   * @param accessible Status aksesibilitas dari cell.
   */
  public Cell(Point position, boolean accessible) {
    this.position = position;
    this.accessible = accessible;
  }

  // Getter
  public boolean isAccessible() {
    return accessible;
  }

  public Point getPosition() {
    return position;
  }
}