package com.intellizoo.virtualzoo.zoo.cell;

/**
 * Created by Alvin on 26/03/2017.
 */

import com.intellizoo.virtualzoo.renderer.renderable.Renderable;
import com.intellizoo.virtualzoo.renderer.point.Point;

/**
 * @class cell Kelas abstrak cell yang merepesentasikan sebuah petak tanah.
 */
public abstract class Cell implements Renderable {

  private Point position;
  private boolean accessible;

  /**
   * @param position Posisi dari cell.
   * @param accessible Status aksesibilitas dari cell.
   * @brief Constructor.
   * @details Menciptakan sebuah cell dengan posisi dan status aksesibilitas tertentu.
   */
  public Cell(Point position, boolean accessible) {
    this.position = position;
    this.accessible = accessible;
  }

  /**
   * @return Status aksesibiltas dari cell (true jika bisa diakses dan false jika tidak).
   * @brief Memeriksa status aksesibilitas dari cell.
   */
  public boolean IsAccessible() {
    return accessible;
  }

  /**
   * @return Posisi cell.
   * @brief Mengembalikan posisi cell.
   */
  public Point GetPosition() {
    return position;
  }
};