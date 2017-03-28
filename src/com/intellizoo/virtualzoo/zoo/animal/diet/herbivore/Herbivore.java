package com.intellizoo.virtualzoo.zoo.animal.diet.herbivore;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

// Nama file         : Herbivore.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Herbivore yang merepesentasikan hewan herbivora.
 * @author Agus Gunawan
 */
public class Herbivore extends Diet {
  /**
   * Menciptakan hewan herbivora dengan berat tertentu dan perbandingan berat terhadap
   * jumlah makanannya.
   * @param weight Berat hewan.
   * @param ratio Perbandingan berat terhadap jumlah makanan hewan.
   */
  public Herbivore(int weight, double ratio) {
    super(weight, ratio);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public double calculateTotalMeat() {
    return 0;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif
   * terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public double calculateTotalVegetable() {
    return weight * ratio;
  }
}
