package com.intellizoo.virtualzoo.zoo.cell.road;

/**
 * Created by Alvin on 26/03/2017.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/**
 * @class road Kelas road yang merepresentasikan fasilitas yang berupa jalan.
 */
public class Road extends Cell {

  private boolean entrance;
  private boolean exit;

  /**
   * @param position Posisi dari jalan.
   * @param accessible Status aksesibilitas jalan.
   * @param entrance true jika jalan adalah jalan masuk, false jika tidak.
   * @param exit true jika jalan adalah jalan keluar, false jika tidak.
   * @brief Constructor.
   * @details Menciptakan sebuah jalan dengan status aksesibilitas tertentu pada posisi tertentu.
   * Jalan dapat berupa jalan biasa, jalan masuk, atau jalan keluar.
   */
  public Road(Point position, boolean accessible, boolean entrance, boolean exit) {
    super(position, accessible);
    this.entrance = entrance;
    this.exit = exit;
  }

  /**
   * @return True jika dan hanya jika petak jalan adalah pintu masuk.
   * @brief Mengecek apakah sebuah petak jalan adalah pintu masuk.
   */
  public boolean IsEntrance() {
    return entrance;
  }

  /**
   * @param entrance Jika true, mengeset jalan menjadi pintu masuk. Jika false, mengeset jalan
   * menjadi bukan pintu masuk.
   * @brief Mengeset apakah sebuah jalan adalah pintu masuk.
   */
  public void SetEntrance(boolean entrance) {
    this.entrance = entrance;
  }

  /**
   * @return True jika dan hanya jika petak jalan adalah pintu keluar.
   * @brief Mengecek apakah sebuah petak jalan adalah pintu keluar.
   */
  public boolean IsExit() {
    return exit;
  }

  /**
   * @param exit Jika true, mengeset jalan menjadi pintu keluar. Jika false, mengeset jalan menjadi
   * bukan pintu keluar.
   * @brief Mengeset apakah sebuah jalan adalah pintu keluar.
   */
  public void SetExit(boolean exit) {
    this.exit = exit;
  }

  /**
   * @return Representasi teks jalan.
   * @brief Menampilkan jalan ke console teks.
   */
  public char Render() {
    return '.';
  }
};