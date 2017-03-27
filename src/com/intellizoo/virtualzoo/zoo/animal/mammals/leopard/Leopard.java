package com.intellizoo.virtualzoo.zoo.animal.mammals.leopard;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Leopard
 * Kelas Leopard yang merepesentasikan macan tutul.
 */
public class Leopard extends Mammals {
  /** @brief Constructor.
   * @details Menciptakan seekor macan tutul dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi macan tutul.
   * @param weight berat macan tutul.
   * @param wild Kelakuan macan tutul.
   */
  public Leopard(Point pos, int weight, boolean wild) {
    super("Leopard");
    diet = new Carnivore(weight, 0.05);
    description = "Leopard is an animal from Africa and Asia. It is one of " +
                  " five 'big cats' with ability to adapt to various habitats and" +
                  " could run at speeds of up to 58 kmph. This vivipar animal has" +
                  " land as its habitat.";
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
    AddPrey("Lion");
    AddPrey("Orangutan");
    AddPrey("Tiger");
    AddPrey("Chameleon");
    AddPrey("Cobra");
    AddPrey("Iguana");
    AddPrey("KomodoDragon");
    AddPrey("Python");
  }

  /** @brief Melakukan interaksi dengan macan tutul.
   * @return Experience yang dirasakan ketika berinteraksi dengan macan tutul.
   */
  public String Interact() {
    return "The leopard is sleeping with its family";
  }
}
