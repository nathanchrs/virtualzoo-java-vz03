package com.intellizoo.virtualzoo.zoo.animal.aves.owl;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.diet.herbivore.Herbivore;

/**
 * Created by aegis on 26/03/17.
 */

/** @class Owl
 * Kelas Owl yang merepesentasikan burung hantu.
 */
public class Owl extends Aves {
  /** @brief Constructor.
   * @details Menciptakan seekor burung hantu dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi burung hantu.
   * @param weight berat burung hantu.
   * @param wild Kelakuan burung hantu.
   */
  public Owl(Point pos, int weight, boolean wild) {
    super("Owl");
    diet = new Carnivore(weight, 0.2);
    description = "Owls possess large, forward-facing eyes and ear-holes, a" +
    " hawk-like beak, a flat face, and usually a " +
    " conspicuous circle of feathers, a facial disc, around each" +
    " eye. Owls can rotate their heads and necks as much as 270°." +
    " This ovipar animal has land and air as its habitat";
    air_animal = true;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan burung hantu.
   * @return Experience yang dirasakan ketika berinteraksi dengan
   * burung hantu.
   */
  public String Interact() {
    return "Owls rotate their heads and make 'kuk kuk' sound";
  }

}
