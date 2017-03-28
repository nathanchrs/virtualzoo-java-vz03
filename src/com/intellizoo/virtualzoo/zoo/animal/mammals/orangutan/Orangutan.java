package com.intellizoo.virtualzoo.zoo.animal.mammals.orangutan;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Omnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

// Nama file         : Orangutan.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Orangutan yang merepesentasikan orangutan.
 * @author Agus Gunawan
 */
public class Orangutan extends Mammals {
  /**
   * Menciptakan seekor orangutan dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi orangutan.
   * @param weight berat orangutan.
   * @param wild Kelakuan orangutan.
   */
  public Orangutan(Point pos, int weight, boolean wild) {
    super("Orangutan");
    diet = new Omnivore(weight, 0.2);
    description = "Orangutan is an animal from Indonesia and Malaysia. It is" +
                  " one of the most intelligent primates that could use a" +
                  " variety of sophisticated tools and well known for its great" +
                  " learning abilities. This vivipar animal has land as its" +
                  " habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan orangutan.
   * @return Experience yang dirasakan ketika berinteraksi dengan orangutan.
   */
  public String interact() {
    return  "The orangutan is hanging around the trees, picking every fruits and" +
            " eating them";
  }
}
