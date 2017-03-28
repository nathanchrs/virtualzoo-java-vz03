package com.intellizoo.virtualzoo.zoo.animal.diet;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Omnivore.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import com.intellizoo.virtualzoo.zoo.animal.Animal;

/**
 * Kelas Omnivore yang merepresentasikan diet omnivora.
 * @author Agus Gunawan
 */
public class Omnivore extends Diet {
  /**
   * Menciptakan diet omnivora untuk sebuah hewan.
   * @param animal Hewan yang memiliki diet ini.
   */
  public Omnivore(Animal animal) {
    super(animal);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalMeatNeeded() {
    return animal.getWeight() * animal.getFoodToWeightRatio() / 2.0;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalVegetableNeeded() {
    return animal.getWeight() * animal.getFoodToWeightRatio() / 2.0;
  }
}
