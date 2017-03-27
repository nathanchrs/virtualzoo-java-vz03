package com.intellizoo.virtualzoo.zoo.animal.pisces.barracuda;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Barracuda
 * Kelas Barracuda yang merepesentasikan ikan barakuda.
 */
public class Barracuda extends Pisces {
  /** @brief Constructor.
   * @details Menciptakan seekor barakuda dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi barakuda.
   * @param weight berat barakuda.
   * @param wild Kelakuan barakuda.
   */
  public Barracuda(Point pos, int weight, boolean wild) {
    super("Barracuda");
    diet = new Carnivore(weight, 0.15);
    description = "Barracuda is an animal found in tropical and subtropical" +
                  " oceans. It is snake-like in appearance with  fang-like teeth." +
                  " This ovipar animal has water as its habitat.";
    air_animal = false;
    land_animal = false;
    water_animal = true;
    position = pos;
    this.wild = wild;
    AddPrey("FrenchAngelFish");
    AddPrey("Lionfish");
    AddPrey("Ray");
    AddPrey("Seahorse");
  }

  /** @brief Melakukan interaksi dengan ikan barakuda.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan barakuda
   */
  public String Interact() {
    return "The barracuda is eating";
  }
}
