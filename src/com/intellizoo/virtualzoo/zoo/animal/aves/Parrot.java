package com.intellizoo.virtualzoo.zoo.animal.aves;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.AirAnimal;
import com.intellizoo.virtualzoo.zoo.animal.LandAnimal;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;

// Nama file         : Parrot.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Parrot yang merepesentasikan burung beo.
 * @author Agus Gunawan
 */
public class Parrot extends Aves implements AirAnimal, LandAnimal {
  /**
   * Menciptakan seekor burung beo dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama burung beo.
   * @param position Posisi burung beo.
   * @param weight berat burung beo.
   * @param wild Kelakuan burung beo.
   */
  public Parrot(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Herbivore(weight, 0.05);
    this.wild = wild;
    this.description = "Parrot is an animal that can be found in South America"
        + " and Australasia. Parrots are intelligent birds. They have"
        + " relatively large brains, they can learn, and they can use"
        + " simple tools. This ovipar animal has land and air as its"
        + " habitat.";
  }

  /**
   * Melakukan interaksi dengan burung beo.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung beo.
   */
  public String interact() {
    return "The parrot is imitating someone's voice that said 'I'm handsome!'";
  }
}
