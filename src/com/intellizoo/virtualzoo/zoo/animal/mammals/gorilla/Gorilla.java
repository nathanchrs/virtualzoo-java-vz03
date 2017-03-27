package com.intellizoo.virtualzoo.zoo.animal.mammals.gorilla;

/**
 * Created by aegis on 27/03/17.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.herbivore.Herbivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

/** @class Gorilla
 * Kelas Gorilla yang merepesentasikan gorilla.
 */
public class Gorilla extends Mammals {
  /** @brief Constructor.
   * @details Menciptakan seekor gorilla dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi gorilla.
   * @param weight berat gorilla.
   * @param wild Kelakuan gorilla.
   */
  public Gorilla(Point pos, int weight, boolean wild) {
    super("Gorilla");
    diet = new Herbivore(weight, 0.25);
    description = "Gorilla is an animal from Africa. It is the largest living" +
                  " primate and the closest living relatives to humans." +
                  " This vivipar animal has land as its habitat.";
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan gorilla.
   * @return Experience yang dirasakan ketika berinteraksi dengan gorilla.
   */
  public String Interact() {
    return "The gorilla is playing with its toy";
  }
}
