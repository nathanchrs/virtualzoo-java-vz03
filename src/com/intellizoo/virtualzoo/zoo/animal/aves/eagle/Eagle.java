package com.intellizoo.virtualzoo.zoo.animal.aves.eagle;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;

/**
 * Created by aegis on 26/03/17.
 */

/** @class Eagle
 * Kelas Eagle yang merepesentasikan elang.
 */
public class Eagle extends Aves {
  /** @brief Constructor.
   * @details Menciptakan seekor elang dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi elang.
   * @param weight berat elang.
   * @param wild Kelakuan elang.
   */
  public Eagle(Point pos, int weight, boolean wild) {
    super("Eagle");
    diet = new Carnivore(weight, 0.25);
    description = "The eagle is a (generally) large sized bird of prey meaning" +
                  " that the eagle is one of the most dominant predators in the" +
                  " sky. Eagles are most commonly found in the Northern" +
                  " Hemisphere including Europe, Asia and North America." +
                  " Eagles are also found on the African continent." +
                  " This ovipar animal has land and air as its habitat";
    air_animal = true;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
    AddPrey("Owl");
    AddPrey("Parrot");
    AddPrey("Peacock");
    AddPrey("Pigeon");
    AddPrey("Chameleon");
    AddPrey("Cobra");
    AddPrey("Iguana");
    AddPrey("Python");
  }

  /** @brief Melakukan interaksi dengan elang.
   * @return Experience yang dirasakan ketika berinteraksi dengan elang.
   */
  public String Interact() {
    return "The eagle is eating its food that the zoo keeper gave";
  }

}
