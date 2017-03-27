package com.intellizoo.virtualzoo.zoo.animal.aves.peacock;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.omnivore.Omnivore;

/**
 * Created by aegis on 26/03/17.
 */

/** @class Peacock
 * Kelas Peacock yang merepesentasikan burung merak.
 */
public class Peacock extends Aves {
  /** @brief Constructor.
   * @details Menciptakan seekor elang dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi elang.
   * @param weight berat elang.
   * @param wild Kelakuan elang.
   */
  public Peacock(Point pos, int weight, boolean wild) {
    super("Peacock");
    diet = new Omnivore(weight, 0.15);
    description = "The Peacock is found in many locations including Burma, Indian," +
                  " and Sri Lanka. The main body of the Peacock is bluish green in color." +
                  " Peacock has colorful tail. The colorful tail of the Peacock is fanned" +
                  " out to be able to show dominance and for the purpose of attracting a" +
                  " mate. This ovipar animal has land as its habitat.";
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan burung merak.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung merak.
   */
  public String Interact() {
    return "The peacock is spreading its tail";
  }

}
