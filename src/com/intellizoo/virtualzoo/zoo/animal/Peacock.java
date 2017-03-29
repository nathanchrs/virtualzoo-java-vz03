package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : Peacock.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Peacock yang merepesentasikan burung merak.
 * @author Agus Gunawan
 */
public class Peacock extends Aves implements LandAnimal {
  /**
   * Menciptakan seekor burung merak dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama burung merak.
   * @param position Posisi burung merak.
   * @param weight berat burung merak.
   * @param wild Kelakuan burung merak.
   */
  public Peacock(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Omnivore(weight, 0.15);
    this.wild = wild;
    this.description = "The Peacock is found in many locations including Burma, Indian,"
        + " and Sri Lanka. The main body of the Peacock is bluish green in color."
        + " Peacock has colorful tail. The colorful tail of the Peacock is fanned"
        + " out to be able to show dominance and for the purpose of attracting a"
        + " mate. This ovipar animal has land as its habitat.";
  }

  /**
   * Melakukan interaksi dengan burung merak.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung merak.
   */
  public String interact() {
    return "The peacock is spreading its tail";
  }
}
