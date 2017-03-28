package com.intellizoo.virtualzoo.zoo.animal.diet;
import com.intellizoo.virtualzoo.zoo.animal.Animal;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Diet.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

/**
 * Kelas Diet yang merepesentasikan hewan berdasarkan jenis makanannya.
 *
 * @author Agus Gunawan
 */
public abstract class Diet {
  protected Animal animal;
  protected double foodToWeightRatio;

  /**
   * Menciptakan diet untuk hewan tertentu dan perbandingan berat terhadap jumlah makanannya.
   *
   * @param animal Hewan yang memiliki diet ini.
   */
  public Diet(Animal animal) {
    this.animal = animal;
  }

  /**
   * Menghitung banyaknya daging yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya daging yang dikonsumsi setiap hari.
   */
  public abstract double calculateTotalMeatNeeded();

  /**
   * Menghitung banyaknya sayuran yang dikonsumsi setiap hari relatif terhadap berat badannnya.
   *
   * @return Banyaknya sayuran yang dikonsumsi setiap hari.
   */
  public abstract double calculateTotalVegetableNeeded();
}
