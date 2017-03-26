package com.intellizoo.virtualzoo.zoo.cell.restaurant;

/**
  * Created by Alvin on 26/03/2017.
  */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/** @class restaurant
  * Kelas restaurant yang merepesentasikan fasilitas yang berupa restoran.
  */
public class Restaurant extends Cell {
  /** @brief Constructor.
    * @details Menciptakan sebuah restoran dengan status aksesibilitas
    * tertentu pada posisi tertentu.
    * @param position Posisi dari restoran.
    * @param accessible Status aksesibilitas restoran.
    */
  public Restaurant(Point position, boolean accessible) {
    super(position, accessible);
  };

  /** @brief Menampilkan restoran ke console teks.
    * @return Representasi teks restoran.
    */
  public char Render() {
    return 'r';
  };
};