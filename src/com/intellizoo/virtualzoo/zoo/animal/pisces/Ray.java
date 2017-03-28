package com.intellizoo.virtualzoo.zoo.animal.pisces;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.WaterAnimal;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Ray.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Ray yang merepesentasikan ikan pari.
 * @author Agus Gunawan
 */
public class Ray extends Pisces implements WaterAnimal {
  /**
   * Menciptakan seekor ikan pari dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param name Nama ikan pari.
   * @param position Posisi ikan pari.
   * @param weight berat ikan pari.
   * @param wild Kelakuan ikan pari.
   */
  public Ray(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.25);
    this.wild = wild;
    this.description = "Ray is an animal lives on the sea floor. It is distinguished"
        + " by their flattened bodies and enlarged pectoral fins that are fused"
        + " to the head. This ovipar animal has water as its habitat.";
  }

  /**
   * Melakukan interaksi dengan ikan pari.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan pari.
   */
  public String interact() {
    return "The ray is swimming as floating through the water";
  }
}
