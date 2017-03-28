package com.intellizoo.virtualzoo.zoo.animal.pisces.frenchangelfish;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

// Nama file         : FrenchAngelFish.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas FrenchAngelFish yang merepesentasikan french angelfish.
 * @author Agus Gunawan
 */
public class FrenchAngelFish extends Pisces {
  /**
   * Menciptakan seekor french angelfish dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi french angelfish.
   * @param weight berat french angelfish.
   * @param wild Kelakuan french angelfish.
   */
  public FrenchAngelFish(Point pos, int weight, boolean wild) {
    super("FrenchAngelFish");
    diet = new Herbivore(weight, 0.05);
    description = "French angelfish is an animal found in western Atlantic," +
                  " the Bahamas, and the Gulf of Mexico. It is colored with black" +
                  " but the scales of the body are rimmed with golden yellow." +
                  " This ovipar animal has water as its habitat.";
    airAnimal = false;
    landAnimal = false;
    waterAnimal = true;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan french angelfish.
   * @return Experience yang dirasakan ketika berinteraksi dengan french angelfish.
   */
  public String interact() {
    return "Splash! It is swimming";
  }
}
