package com.intellizoo.virtualzoo.zoo.animal;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Carnivore.java
 * Tanggal dibuat    : 28/03/17
 * Tanggal perubahan : 28/03/17
 */

/**
 * Kelas Carnivore yang merepresentasikan diet karnivora.
 *
 * @author Jordhy Fernando
 */
public class Carnivore extends Diet {

  /**
   * Menciptakan diet untuk hewan tertentu dan perbandingan berat terhadap jumlah makanannya.
   *
   * @param weight Berat hewan
   * @param foodToWeightRatio Jumlah makanan yang dibutuhkan per satuan berat hewan.
   */
  public Carnivore(double weight, double foodToWeightRatio) {
    super(weight, foodToWeightRatio);
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalMeatNeeded() {
    return weight * foodToWeightRatio;
  }

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  @Override
  public double calculateTotalVegetableNeeded() {
    return 0;
  }
}
