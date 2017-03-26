package com.intellizoo.virtualzoo.zoo.cell.road;

/**
 * Created by Alvin on 26/03/2017.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/** @class road
 * Kelas road yang merepresentasikan fasilitas yang berupa jalan.
 */
public class Road extends Cell {
  private boolean entrance;
  private boolean exit;

  /** @brief Constructor.
    * @details Menciptakan sebuah jalan dengan status aksesibilitas
    * tertentu pada posisi tertentu. Jalan dapat berupa jalan biasa,
    * jalan masuk, atau jalan keluar.
    * @param position Posisi dari jalan.
    * @param accessible Status aksesibilitas jalan.
    * @param entrance true jika jalan adalah jalan masuk, false jika tidak.
    * @param exit true jika jalan adalah jalan keluar, false jika tidak.
    */
  public Road(Point position, boolean accessible, boolean entrance, boolean exit) {
    super(position, accessible);
    this.entrance = entrance;
    this.exit = exit;
  };

  /** @brief Mengecek apakah sebuah petak jalan adalah pintu masuk.
    * @return True jika dan hanya jika petak jalan adalah pintu masuk.
    */
  public boolean IsEntrance() {
    return entrance;
  };

  /** @brief Mengeset apakah sebuah jalan adalah pintu masuk.
    * @param entrance Jika true, mengeset jalan menjadi pintu masuk.
    * Jika false, mengeset jalan menjadi bukan pintu masuk.
    */
  public void SetEntrance(boolean entrance) {
    this.entrance = entrance;
  };

  /** @brief Mengecek apakah sebuah petak jalan adalah pintu keluar.
    * @return True jika dan hanya jika petak jalan adalah pintu keluar.
    */
  public boolean IsExit() {
    return exit;
  };

  /** @brief Mengeset apakah sebuah jalan adalah pintu keluar.
    * @param exit Jika true, mengeset jalan menjadi pintu keluar.
    * Jika false, mengeset jalan menjadi bukan pintu keluar.
    */
  public void SetExit(boolean exit) {
    this.exit = exit;
  };

  /** @brief Menampilkan jalan ke console teks.
    * @return Representasi teks jalan.
    */
  public char Render() {
    return '.';
  };
};