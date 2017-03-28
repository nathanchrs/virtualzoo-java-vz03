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

/**
 * Kelas Omnivore yang merepresentasikan diet omnivora.
 *
 * @author Agus Gunawan
 */
public class Omnivore extends Diet {

  /**
   * Menciptakan diet untuk hewan tertentu dan perbandingan berat terhadap jumlah makanannya.
   *
   * @param weight Berat hewan
   * @param foodToWeightRatio Jumlah makanan yang dibutuhkan per satuan berat hewan.
   */
  public Omnivore(double weight, double foodToWeightRatio) {
    super(weight, foodToWeightRatio);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalMeatNeeded() {
    return weight * foodToWeightRatio / 2.0;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalVegetableNeeded() {
    return weight * foodToWeightRatio / 2.0;
  }
}
