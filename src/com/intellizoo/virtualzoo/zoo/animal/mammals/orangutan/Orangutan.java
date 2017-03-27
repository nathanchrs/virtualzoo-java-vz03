package com.intellizoo.virtualzoo.zoo.animal.mammals.orangutan;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.omnivore.Omnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Orangutan
 * Kelas Orangutan yang merepesentasikan orangutan.
 */
public class Orangutan extends Mammals {
  /** @brief Constructor.
   * @details Menciptakan seekor orangutan dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
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
    air_animal = false;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan orangutan.
   * @return Experience yang dirasakan ketika berinteraksi dengan orangutan.
   */
  public String Interact() {
    return  "The orangutan is hanging around the trees, picking every fruits and" +
            " eating them";
  }
}
