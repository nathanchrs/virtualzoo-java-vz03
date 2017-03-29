package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : Orangutan.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Orangutan yang merepesentasikan orangutan.
 * @author Agus Gunawan
 */
public class Orangutan extends Mammals implements LandAnimal {
  /**
   * Menciptakan seekor orangutan dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama orangutan.
   * @param position Posisi orangutan.
   * @param weight berat orangutan.
   * @param wild Kelakuan orangutan.
   */
  public Orangutan(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Omnivore(weight, 0.2);
    this.wild = wild;
    this.description = "Orangutan is an animal from Indonesia and Malaysia. It is"
        + " one of the most intelligent primates that could use a"
        + " variety of sophisticated tools and well known for its great"
        + " learning abilities. This vivipar animal has land as its"
        + " habitat.";
  }

  /**
   * Melakukan interaksi dengan orangutan.
   * @return Experience yang dirasakan ketika berinteraksi dengan orangutan.
   */
  public String interact() {
    return  "The orangutan is hanging around the trees, picking every fruits and"
            + " eating them";
  }
}
