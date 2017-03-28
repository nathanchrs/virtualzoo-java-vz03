package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;

// Nama file         : Gorilla.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Gorilla yang merepesentasikan gorilla.
 * @author Agus Gunawan
 */
public class Gorilla extends Mammals implements LandAnimal {
  /**
   * Menciptakan seekor gorilla dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama gorilla.
   * @param position Posisi gorilla.
   * @param weight berat gorilla.
   * @param wild Kelakuan gorilla.
   */
  public Gorilla(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Herbivore(weight, 0.25);
    this.wild = wild;
    this.description = "Gorilla is an animal from Africa. It is the largest living"
        + " primate and the closest living relatives to humans."
        + " This vivipar animal has land as its habitat.";
  }

  /**
   * Melakukan interaksi dengan gorilla.
   * @return Experience yang dirasakan ketika berinteraksi dengan gorilla.
   */
  public String interact() {
    return "The gorilla is playing with its toy";
  }
}
