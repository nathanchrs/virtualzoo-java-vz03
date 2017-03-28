package com.intellizoo.virtualzoo.zoo.animal.aves;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.AirAnimal;
import com.intellizoo.virtualzoo.zoo.animal.LandAnimal;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;

/**
 * Kelas Pigeon yang merepesentasikan burung merpati.
 * @author Agus Gunawan
 */
public class Pigeon extends Aves implements AirAnimal, LandAnimal {
  /**
   * Menciptakan seekor burung merpati dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama burung merpati.
   * @param position Posisi burung merpati.
   * @param weight berat burung merpati.
   * @param wild Kelakuan burung merpati.
   */
  public Pigeon(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Herbivore(weight, 0.1);
    this.wild = wild;
    this.description = "Pigeons is stout-bodied birds with short necks, and short"
        + " slender bills. Pigeon is a French word that derives from the"
        + " Latin pipio, for a \"peeping\" chick. Pigeons and doves are"
        + " distributed everywhere on Earth, except for the driest areas"
        + " of the Sahara Desert, Antarctica and its surrounding islands,"
        + " and the high Arctic. This ovipar animal has land and air as"
        + " its habitat";
  }

  /**
   * Melakukan interaksi dengan burung merpati.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung merpati.
   */
  public String interact() {
    return "The pigeon is eating its food that a visitor gave.";
  }

}
