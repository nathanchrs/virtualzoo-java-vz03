package com.intellizoo.virtualzoo.zoo.animal.reptile.chameleon;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

// Nama file         : Chameleon.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Chameleon yang merepesentasikan bunglon.
 * @author Agus Gunawan
 */
public class Chameleon extends Reptile {
  /**
   * Menciptakan seekor bunglon dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi bunglon.
   * @param weight berat bunglon.
   * @param wild Kelakuan bunglon.
   */
  public Chameleon(Point pos, int weight, boolean wild) {
    super("Chameleon");
    diet = new Carnivore(weight, 0.05);
    description = "The chameleon are a distinctive and highly specialized clade" +
                  " of Old World lizards. Chameleons primarily live in the" +
                  " mainland of sub-Saharan Africa and on the island of" +
                  " Madagascar. These species come in a range of colors, and many" +
                  " species have the ability to change color." +
                  " This ovipar animal has land as its habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan bunglon.
   * @return Experience yang dirasakan ketika berinteraksi dengan bunglon.
   */
  public String interact() {
    return "The chameleon is changing its color and its color become like leaf";
  }
}
