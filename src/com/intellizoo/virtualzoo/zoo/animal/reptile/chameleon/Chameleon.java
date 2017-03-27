package com.intellizoo.virtualzoo.zoo.animal.reptile.chameleon;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Chameleon
 * Kelas Chameleon yang merepesentasikan bunglon.
 */
public class Chameleon extends Reptile {
  /** @brief Constructor.
   * @details Menciptakan seekor bunglon dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
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
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan bunglon.
   * @return Experience yang dirasakan ketika berinteraksi dengan bunglon.
   */
  public String Interact() {
    return "The chameleon is changing its color and its color become like leaf";
  }
}
