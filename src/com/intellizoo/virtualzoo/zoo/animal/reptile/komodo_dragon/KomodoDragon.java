package com.intellizoo.virtualzoo.zoo.animal.reptile.komodo_dragon;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

/**
 * Created by aegis on 27/03/17.
 */
public class KomodoDragon extends Reptile {
  /** @brief Constructor.
   * @details Menciptakan seekor komodo dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi komodo.
   * @param weight berat komodo.
   * @param wild Kelakuan komodo.
   */
  public KomodoDragon(Point pos, int weight, boolean wild) {
    super("KomodoDragon");
    diet = new Carnivore(weight, 0.25);
    description = "The komodo dragon is a large species of lizard found in the" +
                  " Indonesian islands of Komodo, Rinca, Flores, Gili Motang, and Padar." +
                  " It has been claimed that they have a venomous bite; there are two" +
                  " glands in the lower jaw which secrete several toxic proteins." +
                  " This ovipar animal has land as its habitat.";
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
    AddPrey("Tiger");
    AddPrey("Chameleon");
    AddPrey("Cobra");
    AddPrey("Iguana");
    AddPrey("Python");
  }

  /** @brief Melakukan interaksi dengan komodo.
   * @return Experience yang dirasakan ketika berinteraksi dengan komodo.
   */
  public String Interact() {
    return "The komodo dragon is eating some beef that the zookeper gave";
  }
}
