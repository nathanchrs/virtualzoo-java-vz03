package com.intellizoo.virtualzoo.zoo.cell.habitat;

/**
  * Created by Alvin on 26/03/2017.
  */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

/** @class habitat
  * Kelas abstrak habitat yang merepresentasikan petak habitat.
  */
public class Habitat extends Cell {
  private HabitatType type;

  /** @enum HabitatType
    * Jenis-jenis habitat yang ada.
    */
  public enum HabitatType {
    AirHabitat, LandHabitat, WaterHabitat
  };

  /** @brief Constructor.
    * @details Menciptakan sebuah habitat dengan jenis tertentu pada posisii tertentu.
    * @param position Posisi sel habitat.
    * @param type Jenis dari habitat.
    */
  public Habitat(Point position, HabitatType type) {
    super(position,false);
    this.type = type;
  };

  /** @brief Mengembalikan jenis habitat.
    * @return Jenis habitat.
    */
  public HabitatType GetType() {
    return type;
  };

  /** @brief Mengembalikan representasi teks habitat.
    * @return Sebuah char yang merupakan representasi teks habitat.
    */
  public char Render() {
    switch (type) {
      case AirHabitat:
        return 'a';
      case LandHabitat:
        return 'l';
      case WaterHabitat:
        return 'w';
    }
    return ' ';
  };
};