package com.intellizoo.virtualzoo.zoo.zone.cage;

import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import java.util.List;

// Nama file         : Cage.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Cage yang merepresentasikan kandang.
 * @author Alvin Sullivan
 */

/**
 * @class Cage Kelas Cage yang merepesentasikan kandang.
 */
public class Cage extends Zone {

  private List<Animal> animals;

  /**
   * @param name Nama kandang.
   * @brief Constructor.
   * @details Menciptakan sebuah kandang dengan ukuran tertentu dengan jumlah kapasitas hewan
   * maksimal 30% dari ukuran kandang. Daftar cell hewan di dalam kandang pada awalnya kosong.
   */
  public Cage(String name) {
    super(name);
  }

  /**
   * @param animal Pointer dari hewan yang dimasukkan ke dalam kandang.
   * @brief Menambahkan seekor hewan ke dalam kandang, jika kandang belum penuh.
   */
  public void AddAnimal(Animal[] animal) {
    if (!IsFull()) {
      animals.add(animal);
    } else {
      //throw CageExceedsCapacityException();
    }
  }

  //Getter & Setter
  public Animal[] GetAnimals() {
    return animals;
  }

  /**
   * @return True jika jumlah hewan sudah mencapai kapasitas kandang dan false jika belum.
   * @brief Memeriksa apakah jumlah hewan di dalam kandang sudah mencapai kapasitas (30% ukuran
   * kandang) atau belum.
   */
  boolean IsFull() {
    return animals.size() >= (0.3 * Size());
  }

};