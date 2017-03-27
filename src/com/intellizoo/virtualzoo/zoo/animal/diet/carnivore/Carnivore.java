package com.intellizoo.virtualzoo.zoo.animal.diet.carnivore;

/**
 * Created by aegis on 27/03/17.
 */

import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

/** @class Carnivore
 * Kelas abstrak Carnivore yang merepesentasikan hewan karnivora.
 */
public class Carnivore extends Diet {
  /** @brief Constructor.
   * Menciptakan hewan karnivora dengan berat tertentu.
   * @param weight Berat dari hewan.
   */
  public Carnivore(int weight, double ratio) {
    super(weight, ratio);
  }

  /** @brief Menghitung banyaknya daging yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public double CalculateTotalMeat() {
    return weight * ratio;
  }

  /** @brief Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public double CalculateTotalVegetable() {
    return 0;
  }
}
