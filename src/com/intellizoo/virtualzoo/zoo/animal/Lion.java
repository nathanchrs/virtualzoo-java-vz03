package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : Lion.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Lion yang merepesentasikan singa.
 * @author Agus Gunawan
 */
public class Lion extends Mammals implements LandAnimal {
  /**
   * Menciptakan seekor singa dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama singa.
   * @param position Posisi singa.
   * @param weight berat singa.
   * @param wild Kelakuan singa.
   */
  public Lion(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.15);
    this.wild = wild;
    this.description = "Lion is an animal from Africa. It is the second-largest living"
        + " cat after the tiger with habit of sleeping during the day and"
        + " active primarily at night. This vivipar animal has land as"
        + " its habitat.";
    addPrey(Eagle.class);
    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Gorilla.class);
    addPrey(Leopard.class);
    addPrey(Orangutan.class);
    addPrey(Tiger.class);
    addPrey(Chameleon.class);
    addPrey(Cobra.class);
    addPrey(Iguana.class);
    addPrey(KomodoDragon.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan singa.
   * @return Experience yang dirasakan ketika berinteraksi dengan singa.
   */
  public String interact() {
    return "The lion is yawning";
  }
}
