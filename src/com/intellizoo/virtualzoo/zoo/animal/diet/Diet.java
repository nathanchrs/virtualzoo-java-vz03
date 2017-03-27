package com.intellizoo.virtualzoo.zoo.animal.diet;

/**
 * Created by aegis on 27/03/17.
 */

/** @class Diet
 * Kelas abstrak Diet yang merepesentasikan hewan berdasarkan makanannya.
 */
public abstract class Diet {
  protected int weight;
  protected double ratio;
  protected boolean carnivore;
  protected boolean herbivore;

  /** @brief Constructor.
   * Menciptakan hewan dengan berat tertentu dan perbandingan berat terhadap
   * jumlah makanannya.
   * @param weight Berat hewan.
   * @param ratio Perbandingan berat terhadap jumlah makanan hewan.
   */
  public Diet(int weight, double ratio) {
    this.weight = weight;
    this.ratio = ratio;
  }

  /** @brief Menghitung banyaknya daging yang dikonsumsi
   * setiap hari relatif terhadap berat badannnya.
   * @details Merupakan pure virtual function.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public abstract double CalculateTotalMeat();

  /** @brief Menghitung banyaknya sayuran yang dikonsumsi
   * setiap hari relatif terhadap berat badannnya.
   * @details Merupakan pure virtual function.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public abstract double CalculateTotalVegetable();

}
