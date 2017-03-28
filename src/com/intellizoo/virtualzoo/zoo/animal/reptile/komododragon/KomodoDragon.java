package com.intellizoo.virtualzoo.zoo.animal.reptile.komododragon;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

// Nama file         : KomodoDragon.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

public class KomodoDragon extends Reptile {
  /**
   * Menciptakan seekor komodo dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
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
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
    addPrey("Eagle");
    addPrey("Owl");
    addPrey("Parrot");
    addPrey("Peacock");
    addPrey("Pigeon");
    addPrey("Gorilla");
    addPrey("Leopard");
    addPrey("Lion");
    addPrey("Orangutan");
    addPrey("Tiger");
    addPrey("Chameleon");
    addPrey("Cobra");
    addPrey("Iguana");
    addPrey("Python");
  }

  /**
   * Melakukan interaksi dengan komodo.
   * @return Experience yang dirasakan ketika berinteraksi dengan komodo.
   */
  public String interact() {
    return "The komodo dragon is eating some beef that the zookeper gave";
  }
}
