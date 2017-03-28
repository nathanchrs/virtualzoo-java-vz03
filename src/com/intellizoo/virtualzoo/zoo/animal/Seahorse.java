package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Seahorse.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Seahorse yang merepesentasikan kuda laut.
 * @author Agus Gunawan
 */
public class Seahorse extends Pisces implements WaterAnimal {

  /**
   * Menciptakan seekor kuda laut dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   *
   * @param name Nama kuda laut.
   * @param position Posisi kuda laut.
   * @param weight berat kuda laut.
   * @param wild Kelakuan kuda laut.
   */
  public Seahorse(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.2);
    this.wild = wild;
    this.description = "Seahorse is an animal found in shallow tropical and temperate"
        + " waters throughout the world. It has head and neck suggestive"
        + " of a horse and a curled prehensile tail. This ovipar animal"
        + " has water as its habitat.";
  }

  /**
   * Melakukan interaksi dengan kuda laut.
   * @return Experience yang dirasakan ketika berinteraksi dengan kuda laut.
   */
  public String interact() {
    return "The seahorse is camouflaging, preparing to ambush its prey";
  }
}
