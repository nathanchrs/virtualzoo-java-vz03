package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : Python.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Python yang merepesentasikan ular piton.
 * @author Agus Gunawan
 */
public class Python extends Reptile implements LandAnimal {
  /**
   * Menciptakan seekor ular piton dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama ular piton.
   * @param position Posisi ular piton.
   * @param weight berat ular piton.
   * @param wild Kelakuan ular piton.
   */
  public Python(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.2);
    this.wild = wild;
    this.description = "Pythons are one of the largest snakes. Unlike many other"
        + " snake species, pythons don’t produce venom. Pythons are constrictors."
        + " They kill their prey by squeezing them until they stop breathing."
        + " This ovipar animal has land as its habitat.";
    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Gorilla.class);
    addPrey(Leopard.class);
    addPrey(Lion.class);
    addPrey(Orangutan.class);
    addPrey(Tiger.class);
    addPrey(Cobra.class);
    addPrey(Chameleon.class);
    addPrey(Iguana.class);
    addPrey(KomodoDragon.class);
  }

  /**
   * Melakukan interaksi dengan ular piton.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular piton.
   */
  public String interact() {
    return "The python is squeezing a chicken that the zookeper gave";
  }
}
