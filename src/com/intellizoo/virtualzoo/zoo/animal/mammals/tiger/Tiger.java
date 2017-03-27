package com.intellizoo.virtualzoo.zoo.animal.mammals.tiger;

/**
 * Created by aegis on 27/03/17.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

/** @class Tiger
 * Kelas Tiger yang merepesentasikan harimau.
 */
public class Tiger extends Mammals {
  /** @brief Constructor.
   * @details Menciptakan seekor harimau dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi harimau.
   * @param weight berat harimau.
   * @param wild Kelakuan harimau.
   */
  public Tiger(Point pos, int weight, boolean wild) {
    super("Tiger");
    diet = new Carnivore(weight, 0.1);
    description = "Tiger is an animal from Turkey through South and" +
                  " Southeast Asia. The tiger (Panthera tigris) is the" +
                  " largest cat species, most recognisable for their pattern" +
                  " of dark vertical stripes on reddish-orange" +
                  " fur with a lighter underside. The tiger is wild animal" +
                  " and mostly nocturnal. This vivipar animal" +
                  " has land as its habitat.";
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
    AddPrey("Eagle");
    AddPrey("Owl");
    AddPrey("Parrot");
    AddPrey("Peacock");
    AddPrey("Pigeon");
    AddPrey("Gorilla");
    AddPrey("Leopard");
    AddPrey("Lion");
    AddPrey("Orangutan");
    AddPrey("Chameleon");
    AddPrey("Cobra");
    AddPrey("Iguana");
    AddPrey("KomodoDragon");
    AddPrey("Python");

  }

  /** @brief Melakukan interaksi dengan harimau.
   * @return Experience yang dirasakan ketika berinteraksi dengan harimau.
   */
  public String Interact() {
    return "The tiger is roaring. The sound that tiger produce is rawwrrrrr!";
  }
}
