package com.intellizoo.virtualzoo.zoo.zone;

import com.intellizoo.virtualzoo.zoo.animal.Animal;
import java.util.List;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Cage.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

/**
 * Kelas Cage yang merepresentasikan kandang.
 *
 * @author Alvin Sullivan
 */
public class Cage extends Zone {

  private static final double CAGE_MAX_POPULATION_DENSITY = 0.3;

  private List<Animal> animals;

  public Cage(String name) {
    super(name);
  }

  /**
   * Menambahkan seekor hewan ke dalam kandang ini.
   *
   * @param animal Hewan yang akan ditambahkan.
   */
  public void addAnimal(Animal animal) {
    if (!isFull()) {
      animals.add(animal);
    }
  }

  /**
   * Memeriksa apakah jumlah hewan di dalam kandang sudah mencapai kapasitas atau belum.
   *
   * @return True jika jumlah hewan sudah mencapai kapasitas kandang dan false jika belum.
   */
  public boolean isFull() {
    return animals.size() >= (CAGE_MAX_POPULATION_DENSITY * size());
  }
};