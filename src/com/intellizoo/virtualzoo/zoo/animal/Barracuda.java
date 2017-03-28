package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Barracuda.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Barracuda yang merepesentasikan ikan barakuda.
 * @author Agus Gunawan
 */
public class Barracuda extends Pisces implements WaterAnimal {
  /**
   * Menciptakan seekor barakuda dengan nama, posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   *
   * @param name Nama barakuda.
   * @param position Posisi barakuda.
   * @param weight berat barakuda.
   * @param wild Kelakuan barakuda.
   */
  public Barracuda(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.15);
    this.wild = wild;
    this.description = "Barracuda is an animal found in tropical and subtropical"
        + " oceans. It is snake-like in appearance with  fang-like teeth."
        + " This ovipar animal has water as its habitat.";
    addPrey(FrenchAngelFish.class);
    addPrey(Lionfish.class);
    addPrey(Ray.class);
    addPrey(Seahorse.class);
  }

  /**
   * Melakukan interaksi dengan ikan barakuda.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan barakuda
   */
  public String interact() {
    return "The barracuda is eating";
  }
}
