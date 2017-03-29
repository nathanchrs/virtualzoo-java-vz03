package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : Cobra.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Cobra yang merepesentasikan ular kobra.
 * @author Agus Gunawan
 */
public class Cobra extends Reptile implements LandAnimal {
  /**
   * Menciptakan seekor ular kobra dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama ular kobra.
   * @param position Posisi ular kobra.
   * @param weight berat ular kobra.
   * @param wild Kelakuan ular kobra.
   */
  public Cobra(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.15);
    this.wild = wild;
    this.description = "Cobras, with their threatening hoods and intimidating "
        + " postures, are some of the most iconic"
        + " snakes on Earth. Their elegance, prideful stance"
        + " and venomous bite have made them both respected and"
        + " feared. Cobras occur throughout Africa,"
        + " the Middle East, India, Southeast Asia, and Indonesia."
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
    addPrey(Chameleon.class);
    addPrey(Iguana.class);
    addPrey(KomodoDragon.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan ular kobra.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular kobra.
   */
  public String interact() {
    return "The cobra wag its tail and make some sizzle sound like 'Ssssttt!'";
  }

}
