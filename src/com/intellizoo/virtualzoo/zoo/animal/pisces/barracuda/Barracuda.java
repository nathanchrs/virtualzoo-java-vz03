package com.intellizoo.virtualzoo.zoo.animal.pisces.barracuda;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

// Nama file         : Barracuda.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Barracuda yang merepesentasikan ikan barakuda.
 * @author Agus Gunawan
 */
public class Barracuda extends Pisces {
  /**
   * Menciptakan seekor barakuda dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
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
    airAnimal = false;
    landAnimal = false;
    waterAnimal = true;
    position = pos;
    this.wild = wild;
    addPrey("FrenchAngelFish");
    addPrey("Lionfish");
    addPrey("Ray");
    addPrey("Seahorse");
  }

  /**
   * Melakukan interaksi dengan ikan barakuda.
   * @return Experience yang dirasakan ketika berinteraksi dengan ikan barakuda
   */
  public String interact() {
    return "The barracuda is eating";
  }
}
