package com.intellizoo.virtualzoo.zoo.zone;

import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.AnimalBehavior;
import java.util.ArrayList;
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

  private List<Animal> animals = new ArrayList<>();
  private List<Thread> animalBehaviorThreads = new ArrayList<>();

  /**
   * Exception yang terjadi jika mencoba menambahkan hewan sedemikian sehingga hewan dalam kandang
   * dapat saling memangsa.
   */
  public class CageHasPreyOrPredatorException extends RuntimeException {}

  /**
   * Exception yang terjadi jika mencoba menambahkan hewan melebihi kapasitas kandang.
   */
  public class CageFullException extends RuntimeException {}

  public Cage(String name) {
    super(name);
  }

  public List<Animal> getAnimals() {
    return animals;
  }

  /**
   * Menambahkan seekor hewan ke dalam kandang ini. Hewan hanya bisa ditambahkan dengan syarat
   * hewan-hewan liar dalam kandang tersebut tidak saling memangsa.
   *
   * @param animal Hewan yang akan ditambahkan.
   */
  public void addAnimal(Animal animal) {
    if (!isFull()) {
      boolean hasPreyOrPredator = animals.stream().anyMatch(
          cageAnimal ->
              (cageAnimal.isWild() && cageAnimal.isPrey(animal.getClass()))
                  || (animal.isWild() && animal.isPrey(cageAnimal.getClass()))
      );
      if (!hasPreyOrPredator) {
        animals.add(animal);
      } else {
        throw new CageHasPreyOrPredatorException();
      }
    } else {
      throw new CageFullException();
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

  /**
   * Membuat dan memulai semua thread perilaku hewan untuk hewan dalam kandang ini.
   */
  public void startAnimalBehaviorThreads() {
    for (Animal animal : animals) {
      AnimalBehavior animalBehavior = new AnimalBehavior(animal, this);
      Thread animalBehaviorThread = new Thread(animalBehavior);
      animalBehaviorThreads.add(animalBehaviorThread);
      animalBehaviorThread.start();
    }
  }

  /**
   * Mengirim sinyal berhenti ke semua thread perilaku hewan untuk hewan dalam kandang ini.
   */
  public void terminateAnimalBehaviorThreads() {
    for (Thread animalBehaviorThread : animalBehaviorThreads) {
      animalBehaviorThread.interrupt();
    }
  }
}