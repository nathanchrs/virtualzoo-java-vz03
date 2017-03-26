package com.intellizoo.virtualzoo.zoo.cell.park;

/**
  * Created by Alvin on 26/03/2017.
  */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/** @class park
  * Kelas park yang merepesentasikan fasilitas yang berupa taman.
  */
public class Park extends Cell {
  /** @brief Constructor.
    * @details Menciptakan sebuah taman dengan status aksesibilitas
    * tertentu pada posisi tertentu.
    * @param position Posisi dari taman.
    * @param accessible Status aksesibilitas taman.
    */
  public Park(Point position, boolean accessible) {
    super(position, accessible);
  };

  /** @brief Menampilkan taman ke console teks.
    * @return Representasi teks taman.
    */
  public char Render() {
    return 'p';
  };
};