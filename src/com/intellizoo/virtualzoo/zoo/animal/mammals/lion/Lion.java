package com.intellizoo.virtualzoo.zoo.animal.mammals.lion;

/**
 * Created by aegis on 27/03/17.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

/** @class Lion
 * Kelas Lion yang merepesentasikan singa.
 */
public class Lion extends Mammals {
  /** @brief Constructor.
   * @details Menciptakan seekor singa dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi singa.
   * @param weight berat singa.
   * @param wild Kelakuan singa.
   */
  public Lion(Point pos, int weight, boolean wild) {
    super("Lion");
    diet = new Carnivore(weight, 0.15);
    description = "Lion is an animal from Africa. It is the second-largest living" +
                  " cat after the tiger with habit of sleeping during the day and" +
                  " active primarily at night. This vivipar animal has land as" +
                  " its habitat.";
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
    AddPrey("Orangutan");
    AddPrey("Tiger");
    AddPrey("Chameleon");
    AddPrey("Cobra");
    AddPrey("Iguana");
    AddPrey("KomodoDragon");
    AddPrey("Python");
  }

  /** @brief Melakukan interaksi dengan singa.
   * @return Experience yang dirasakan ketika berinteraksi dengan singa.
   */
  public String Interact() {
    return "The lion is yawning";
  }
}
