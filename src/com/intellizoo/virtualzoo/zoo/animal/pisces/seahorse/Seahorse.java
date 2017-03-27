package com.intellizoo.virtualzoo.zoo.animal.pisces.seahorse;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Seahorse
 * Kelas Seahorse yang merepesentasikan kuda laut.
 */
public class Seahorse extends Pisces {

  /** @brief Constructor.
   * @details Menciptakan seekor kuda laut dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
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
    air_animal = false;
    land_animal = false;
    water_animal = true;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan kuda laut.
   * @return Experience yang dirasakan ketika berinteraksi dengan kuda laut.
   */
  public String Interact() {
    return "The seahorse is camouflaging, preparing to ambush its prey";
  }

}
