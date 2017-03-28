package com.intellizoo.virtualzoo.zoo.animal.diet.omnivore;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

// Nama file         : Omnivore.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Omnivore yang merepesentasikan hewan omnivora.
 * @author Agus Gunawan
 */
public class Omnivore extends Diet {
  /**
   * Menciptakan hewan omnivora dengan berat tertentu dan perbandingan berat terhadap
   * jumlah makanannya.
   * @param weight Berat hewan.
   * @param ratio Perbandingan berat terhadap jumlah makanan hewan.
   */
  public Omnivore(int weight, double ratio) {
    super(weight, ratio);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public double calculateTotalMeat() {
    return weight * ratio / 2.0;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public double calculateTotalVegetable() {
    return weight * ratio / 2.0;
  }
}
