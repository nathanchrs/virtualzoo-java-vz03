package com.intellizoo.virtualzoo.zoo.animal.reptile.cobra;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Cobra
 * Kelas Cobra yang merepesentasikan ular kobra.
 */
public class Cobra extends Reptile {
  /** @brief Constructor.
   * @details Menciptakan seekor ular kobra dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi ular kobra.
   * @param weight berat ular kobra.
   * @param wild Kelakuan ular kobra.
   */
  public Cobra(Point pos, int weight, boolean wild) {
    super("Cobra");
    diet = new Carnivore(weight, 0.15);
    description = "Cobras, with their threatening hoods and intimidating " +
                  " postures, are some of the most iconic" +
                  " snakes on Earth. Their elegance, prideful stance" +
                  " and venomous bite have made them both respected and" +
                  " feared. Cobras occur throughout Africa," +
                  " the Middle East, India, Southeast Asia, and Indonesia." +
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
    AddPrey("Chameleon");
    AddPrey("Iguana");
    AddPrey("KomodoDragon");
    AddPrey("Python");
  }

  /** @brief Melakukan interaksi dengan ular kobra.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular kobra.
   */
  public String Interact() {
    return "The cobra wag its tail and make some sizzle sound like 'Ssssttt!'";
  }

}
