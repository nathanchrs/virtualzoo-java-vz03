package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Omnivore;

// Nama file         : Iguana.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Iguana yang merepesentasikan iguana.
 * @author Agus Gunawan
 */
public class Iguana extends Reptile implements LandAnimal {
  /**
   * Menciptakan seekor iguana dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama iguana.
   * @param position Posisi iguana.
   * @param weight berat iguana.
   * @param wild Kelakuan iguana.
   */
  public Iguana(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Omnivore(weight, 0.1);
    this.wild = wild;
    this.description = "Iguanas are lizards identified by their stocky stature,"
        + " the saggy skin on their throats and the"
        + " spines that protrude from their heads, necks,"
        + " backs and tails. Iguanas live 15 to 20 years"
        + " if cared for properly. The native range of the green iguana"
        + " extends from southern Mexico to central Brazil.";
  }

  /**
   * Melakukan interaksi dengan iguana.
   * @return Experience yang dirasakan ketika berinteraksi dengan iguana.
   */
  public String interact() {
    return "The iguana is climbing a tree";
  }
}
