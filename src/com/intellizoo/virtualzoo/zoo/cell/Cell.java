package com.intellizoo.virtualzoo.zoo.cell;

/**
  * Created by Alvin on 26/03/2017.
  */

import com.intellizoo.virtualzoo.renderer.renderable.Renderable;
import com.intellizoo.virtualzoo.renderer.point.Point;

/** @class cell
  * Kelas abstrak cell yang merepesentasikan sebuah petak tanah.
  */
public abstract class Cell extends Renderable {
  private Point position;
  private boolean accessible;

  /** @brief Constructor.
    * @details Menciptakan sebuah cell dengan posisi dan status aksesibilitas tertentu.
    * @param position Posisi dari cell.
    * @param accessible Status aksesibilitas dari cell.
    */
  public Cell(Point position, boolean accessible) {
    this.position = position;
    this.accessible = accessible;
  };

  /** @brief Memeriksa status aksesibilitas dari cell.
    * @return Status aksesibiltas dari cell
    * (true jika bisa diakses dan false jika tidak).
    */
  public boolean IsAccessible() {
   return accessible;
  };

  /** @brief Mengembalikan posisi cell.
   * @return Posisi cell.
   */
  public Point GetPosition() {
   return position;
  };
};