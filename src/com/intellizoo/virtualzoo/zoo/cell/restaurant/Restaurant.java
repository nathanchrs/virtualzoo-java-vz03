package com.intellizoo.virtualzoo.zoo.cell.restaurant;

/**
 * Created by Alvin on 26/03/2017.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/**
 * @class restaurant Kelas restaurant yang merepesentasikan fasilitas yang berupa restoran.
 */
public class Restaurant extends Cell {

  /**
   * @param position Posisi dari restoran.
   * @param accessible Status aksesibilitas restoran.
   * @brief Constructor.
   * @details Menciptakan sebuah restoran dengan status aksesibilitas tertentu pada posisi
   * tertentu.
   */
  public Restaurant(Point position, boolean accessible) {
    super(position, accessible);
  }

  /**
   * @return Representasi teks restoran.
   * @brief Menampilkan restoran ke console teks.
   */
  public char Render() {
    return 'r';
  }
};