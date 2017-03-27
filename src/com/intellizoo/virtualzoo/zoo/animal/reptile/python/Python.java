package com.intellizoo.virtualzoo.zoo.animal.reptile.python;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Python
 * Kelas Python yang merepesentasikan ular piton.
 */
public class Python extends Reptile {
  /** @brief Constructor.
   * @details Menciptakan seekor ular piton dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi ular piton.
   * @param weight berat ular piton.
   * @param wild Kelakuan ular piton.
   */
  public Python(Point pos, int weight, boolean wild) {
    super("Python");
    diet = new Carnivore(weight, 0.2);
    description = "Pythons are one of the largest snakes. Unlike many other" +
                  " snake species, pythons don’t produce venom. Pythons are constrictors." +
                  " They kill their prey by squeezing them until they stop breathing." +
                  " This ovipar animal has land as its habitat.";
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
    AddPrey("Owl");
    AddPrey("Parrot");
    AddPrey("Peacock");
    AddPrey("Pigeon");
    AddPrey("Gorilla");
    AddPrey("Leopard");
    AddPrey("Lion");
    AddPrey("Orangutan");
    AddPrey("Tiger");
    AddPrey("Cobra");
    AddPrey("Chameleon");
    AddPrey("Iguana");
    AddPrey("KomodoDragon");
  }

  /** @brief Melakukan interaksi dengan ular piton.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular piton.
   */
  public String Interact() {
    return "The python is squeezing a chicken that the zookeper gave";
  }
}
