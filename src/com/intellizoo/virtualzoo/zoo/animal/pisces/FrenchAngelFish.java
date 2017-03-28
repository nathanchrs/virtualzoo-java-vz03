package com.intellizoo.virtualzoo.zoo.animal.pisces;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.WaterAnimal;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;

// Nama file         : FrenchAngelFish.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas FrenchAngelFish yang merepesentasikan french angelfish.
 * @author Agus Gunawan
 */
public class FrenchAngelFish extends Pisces implements WaterAnimal {
  /**
   * Menciptakan seekor french angelfish dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama french angelfish.
   * @param position Posisi french angelfish.
   * @param weight berat french angelfish.
   * @param wild Kelakuan french angelfish.
   */
  public FrenchAngelFish(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Herbivore(weight, 0.05);
    this.wild = wild;
    this.description = "French angelfish is an animal found in western Atlantic,"
        + " the Bahamas, and the Gulf of Mexico. It is colored with black"
        + " but the scales of the body are rimmed with golden yellow."
        + " This ovipar animal has water as its habitat.";
  }

  /**
   * Melakukan interaksi dengan french angelfish.
   * @return Experience yang dirasakan ketika berinteraksi dengan french angelfish.
   */
  public String interact() {
    return "Splash! It is swimming";
  }
}
