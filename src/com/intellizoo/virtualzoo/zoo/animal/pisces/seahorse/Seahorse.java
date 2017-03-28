package com.intellizoo.virtualzoo.zoo.animal.pisces.seahorse;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

// Nama file         : Seahorse.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Seahorse yang merepesentasikan kuda laut.
 * @author Agus Gunawan
 */
public class Seahorse extends Pisces {

  /**
   * Menciptakan seekor kuda laut dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi kuda laut.
   * @param weight berat kuda laut.
   * @param wild Kelakuan kuda laut.
   */
  Seahorse(Point pos, int weight, boolean wild) {
    super("Seahorse");
    diet = new Carnivore(weight, 0.2);
    description = "Seahorse is an animal found in shallow tropical and temperate" +
                  " waters throughout the world. It has head and neck suggestive" +
                  " of a horse and a curled prehensile tail. This ovipar animal" +
                  " has water as its habitat.";
    airAnimal = false;
    landAnimal = false;
    waterAnimal = true;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan kuda laut.
   * @return Experience yang dirasakan ketika berinteraksi dengan kuda laut.
   */
  public String interact() {
    return "The seahorse is camouflaging, preparing to ambush its prey";
  }
}
