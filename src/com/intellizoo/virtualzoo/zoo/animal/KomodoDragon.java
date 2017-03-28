package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : KomodoDragon.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

public class KomodoDragon extends Reptile {
  /**
   * Menciptakan seekor komodo dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama komodo.
   * @param position Posisi komodo.
   * @param weight Berat komodo.
   * @param wild Kelakuan komodo.
   */
  public KomodoDragon(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.25);
    this.wild = wild;
    this.description = "The komodo dragon is a large species of lizard found in the"
        + " Indonesian islands of Komodo, Rinca, Flores, Gili Motang, and Padar."
        + " It has been claimed that they have a venomous bite; there are two"
        + " glands in the lower jaw which secrete several toxic proteins."
        + " This ovipar animal has land as its habitat.";
    addPrey(Eagle.class);
    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Gorilla.class);
    addPrey(Leopard.class);
    addPrey(Lion.class);
    addPrey(Orangutan.class);
    addPrey(Tiger.class);
    addPrey(Chameleon.class);
    addPrey(Cobra.class);
    addPrey(Iguana.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan komodo.
   * @return Experience yang dirasakan ketika berinteraksi dengan komodo.
   */
  public String interact() {
    return "The komodo dragon is eating some beef that the zookeper gave";
  }
}
