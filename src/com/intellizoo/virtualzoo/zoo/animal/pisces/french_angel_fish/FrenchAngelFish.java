package com.intellizoo.virtualzoo.zoo.animal.pisces.french_angel_fish;

/**
 * Created by aegis on 27/03/17.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.herbivore.Herbivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

/** @class FrenchAngelFish
 * Kelas FrenchAngelFish yang merepesentasikan french angelfish.
 */
public class FrenchAngelFish extends Pisces {
  /** @brief Constructor.
   * @details Menciptakan seekor french angelfish dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi french angelfish.
   * @param weight berat french angelfish.
   * @param wild Kelakuan french angelfish.
   */
  public FrenchAngelFish(Point pos, int weight, boolean wild) {
    super("FrenchAngelFish");
    diet = new Herbivore(weight, 0.05);
    description = "French angelfish is an animal found in western Atlantic," +
                  " the Bahamas, and the Gulf of Mexico. It is colored with black" +
                  " but the scales of the body are rimmed with golden yellow." +
                  " This ovipar animal has water as its habitat.";
    air_animal = false;
    land_animal = false;
    water_animal = true;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan french angelfish.
   * @return Experience yang dirasakan ketika berinteraksi dengan french angelfish.
   */
  public String Interact() {
    return "Splash! It is swimming";
  }
}
