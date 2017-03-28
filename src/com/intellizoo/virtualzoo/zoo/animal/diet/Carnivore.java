package com.intellizoo.virtualzoo.zoo.animal.diet;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Carnivore.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import com.intellizoo.virtualzoo.zoo.animal.Animal;

/**
 * Kelas Carnivore yang merepresentasikan diet karnivora.
 * @author Agus Gunawan
 */
public class Carnivore extends Diet {
  /**
   * Menciptakan diet karnivora untuk sebuah hewan.
   * @param animal Hewan yang memiliki diet ini.
   */
  public Carnivore(Animal animal) {
    super(animal);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalMeatNeeded() {
    return animal.getWeight() * animal.getFoodToWeightRatio();
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalVegetableNeeded() {
    return 0;
  }
}
