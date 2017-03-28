package com.intellizoo.virtualzoo.zoo.animal.aves.pigeon;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.herbivore.Herbivore;

/**
 * Created by aegis on 26/03/17.
 */
public class Pigeon extends Aves {
  /** @brief Constructor.
   * @details Menciptakan seekor burung merpati dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi burung merpati.
   * @param weight berat burung merpati.
   * @param wild Kelakuan burung merpati.
   */
  public Pigeon(Point pos, int weight, boolean wild) {
    super("Pigeon");
    diet = new Herbivore(weight, 0.1);
    description = "Pigeons is stout-bodied birds with short necks, and short" +
                  " slender bills. Pigeon is a French word that derives from the" +
                  " Latin pipio, for a \"peeping\" chick. Pigeons and doves are" +
                  " distributed everywhere on Earth, except for the driest areas" +
                  " of the Sahara Desert, Antarctica and its surrounding islands," +
                  " and the high Arctic. This ovipar animal has land and air as" +
                  " its habitat";
    airAnimal = true;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan burung merpati.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung merpati.
   */
  public String interact() {
    return "The pigeon is eating its food that a visitor gave.";
  }

}
