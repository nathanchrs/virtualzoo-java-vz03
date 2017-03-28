package com.intellizoo.virtualzoo.zoo.animal.pisces.ray;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

// Nama file         : Ray.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Ray yang merepesentasikan ikan pari.
 * @author Agus Gunawan
 */
public class Ray extends Pisces {
  /**
   * Menciptakan seekor ikan pari dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi ikan pari.
   * @param weight berat ikan pari.
   * @param wild Kelakuan ikan pari.
   */
  public Ray(Point pos, int weight, boolean wild) {
    super("Ray");
    diet = new Carnivore(weight, 0.25);
    description = "Ray is an animal lives on the sea floor. It is distinguished" +
                  " by their flattened bodies and enlarged pectoral fins that are fused" +
                  " to the head. This ovipar animal has water as its habitat.";
    airAnimal = false;
    landAnimal = false;
    waterAnimal = true;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan ikan pari.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan pari.
   */
  public String interact() {
    return "The ray is swimming as floating through the water";
  }
}
