package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Leopard.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Leopard yang merepesentasikan macan tutul.
 * @author Agus Gunawan
 */
public class Leopard extends Mammals implements LandAnimal {
  /**
   * Menciptakan seekor macan tutul dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   *
   * @param name Nama macan tutul.
   * @param position Posisi macan tutul.
   * @param weight berat macan tutul.
   * @param wild Kelakuan macan tutul.
   */
  public Leopard(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.05);
    this.wild = wild;
    this.description = "Leopard is an animal from Africa and Asia. It is one of "
        + " five 'big cats' with ability to adapt to various habitats and"
        + " could run at speeds of up to 58 kmph. This vivipar animal has"
        + " land as its habitat.";
    addPrey(Eagle.class);
    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Gorilla.class);
    addPrey(Lion.class);
    addPrey(Orangutan.class);
    addPrey(Tiger.class);
    addPrey(Chameleon.class);
    addPrey(Cobra.class);
    addPrey(Iguana.class);
    addPrey(KomodoDragon.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan macan tutul.
   * @return Experience yang dirasakan ketika berinteraksi dengan macan tutul.
   */
  public String interact() {
    return "The leopard is sleeping with its family";
  }
}
