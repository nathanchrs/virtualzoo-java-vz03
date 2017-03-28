package com.intellizoo.virtualzoo.zoo.animal.diet.carnivore;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

// Nama file         : Carnivore.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Carnivore yang merepesentasikan hewan karnivora.
 * @author Agus Gunawan
 */
public class Carnivore extends Diet {
  /**
   * Menciptakan hewan karnivora dengan berat tertentu dan perbandingan berat terhadap
   * jumlah makanannya.
   * @param weight Berat hewan.
   * @param ratio Perbandingan berat terhadap jumlah makanan hewan.
   */
  public Carnivore(int weight, double ratio) {
    super(weight, ratio);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public double calculateTotalMeat() {
    return weight * ratio;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public double calculateTotalVegetable() {
    return 0;
  }
}
