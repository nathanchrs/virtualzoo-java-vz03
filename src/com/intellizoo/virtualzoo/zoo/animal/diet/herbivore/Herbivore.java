package com.intellizoo.virtualzoo.zoo.animal.diet.herbivore;

import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

/**
 * Created by aegis on 27/03/17.
 */
public class Herbivore extends Diet {
  /** @brief Constructor.
   * Menciptakan hewan herbivora dengan berat tertentu.
   * @param weight Berat dari hewan.
   */
  public Herbivore(int weight, double ratio) {
    super(weight, ratio);
  }

  /** @brief Menghitung banyaknya daging yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public double CalculateTotalMeat() {
    return 0;
  }

  /** @brief Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public double CalculateTotalVegetable() {
    return weight * ratio;
  }
}
