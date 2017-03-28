package com.intellizoo.virtualzoo.zoo.animal.mammals.gorilla;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

// Nama file         : Gorilla.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Gorilla yang merepesentasikan gorilla.
 * @author Agus Gunawan
 */
public class Gorilla extends Mammals {
  /**
   * Menciptakan seekor gorilla dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi gorilla.
   * @param weight berat gorilla.
   * @param wild Kelakuan gorilla.
   */
  public Gorilla(Point pos, int weight, boolean wild) {
    super("Gorilla");
    diet = new Herbivore(weight, 0.25);
    description = "Gorilla is an animal from Africa. It is the largest living" +
                  " primate and the closest living relatives to humans." +
                  " This vivipar animal has land as its habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan gorilla.
   * @return Experience yang dirasakan ketika berinteraksi dengan gorilla.
   */
  public String interact() {
    return "The gorilla is playing with its toy";
  }
}
