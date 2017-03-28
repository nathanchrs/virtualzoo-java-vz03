package com.intellizoo.virtualzoo.zoo.cell.habitat;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;

// Nama file         : Habitat.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas habitat yang merepresentasikan petak habitat.
 * @author Alvin Sullivan
 */
public class Habitat extends Cell {
  /**
   * Jenis-jenis habitat yang ada.
   */
  public enum HabitatType {
    AirHabitat, LandHabitat, WaterHabitat
  }

  private HabitatType type;

  /**
   * Menciptakan sebuah habitat dengan jenis tertentu pada posisi tertentu.
   * @param position Posisi sel habitat.
   * @param type Jenis dari habitat.
   */
  public Habitat(Point position, HabitatType type) {
    super(position, false);
    this.type = type;
  }

  //Getter
  public HabitatType getType() {
    return type;
  }

  /**
   * Mengembalikan representasi teks habitat.
   * @return Sebuah karakter yang merupakan representasi teks habitat.
   */
  public char render() {
    switch (type) {
      case AirHabitat:
        return 'a';
      case LandHabitat:
        return 'l';
      case WaterHabitat:
        return 'w';
    }
    return ' ';
  }
}