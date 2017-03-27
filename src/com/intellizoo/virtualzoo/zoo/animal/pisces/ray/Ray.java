package com.intellizoo.virtualzoo.zoo.animal.pisces.ray;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Ray
 * Kelas Ray yang merepesentasikan ikan pari.
 */
public class Ray extends Pisces {
  /** @brief Constructor.
   * @details Menciptakan seekor ikan pari dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
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
    air_animal = false;
    land_animal = false;
    water_animal = true;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan ikan pari.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan pari.
   */
  public String Interact() {
    return "The ray is swimming as floating through the water";
  }
}
