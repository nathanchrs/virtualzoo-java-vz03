package com.intellizoo.virtualzoo.zoo.animal.diet;

// Nama file         : Diet.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/** @class Diet
 * Kelas abstrak Diet yang merepesentasikan hewan berdasarkan makanannya.
 * @author Agus Gunawan
 */
public abstract class Diet {
  protected int weight;
  protected double ratio;

  /**
   * Menciptakan hewan dengan berat tertentu dan perbandingan berat terhadap
   * jumlah makanannya.
   * @param weight Berat hewan.
   * @param ratio Perbandingan berat terhadap jumlah makanan hewan.
   */
  public Diet(int weight, double ratio) {
    this.weight = weight;
    this.ratio = ratio;
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public abstract double calculateTotalMeat();

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public abstract double calculateTotalVegetable();

}
