package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Lionfish.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Lionfish yang merepesentasikan lionfish.
 * @author Agus Gunawan
 */
public class Lionfish extends Pisces implements WaterAnimal {
  /**
   * Menciptakan seekor lionfish dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   *
   * @param name Nama lionfish.
   * @param position Posisi lionfish.
   * @param weight berat lionfish.
   * @param wild Kelakuan lionfish.
   */
  public Lionfish(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.1);
    this.wild = wild;
    this.description = "Lionfish is an animal native to the Indo-Pacific. It is"
        + " characterized by conspicuous warning coloration and venomous"
        + " spiky fin rays. This ovipar animal has water as its habitat.";
  }

  /**
   * Melakukan interaksi dengan lionfish.
   * @return Experience yang dirasakan ketika berinteraksi dengan lionfish.
   */
  public String interact() {
    return "Whoa! I thought it was plant. It is lionfish!";
  }
}
