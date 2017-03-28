package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.renderer.Renderable;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;

import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat.HabitatType;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.AnimalTest.java
 * Tanggal dibuat    : 27/03/2017
 * Tanggal perubahan : 27/03/2017
 */

/**
 * Kelas abstrak Animal yang merepesentasikan seekor hewan. Bertindak juga sebagai Observable dari
 * AnimalMoveEventListener.
 *
 * @author Agus Gunawan
 */
public abstract class Animal implements Renderable {

  protected String name;
  protected String description;
  protected Diet diet;
  protected boolean wild;
  protected double weight;
  protected double foodToWeightRatio;
  protected Point position;
  protected List<Class<? extends Animal>> preys = new ArrayList<>();
  protected List<AnimalMoveEventListener> animalMoveEventListeners = new ArrayList<>();
  // TODO: add AnimalBehavior with threads

  public String getName() {
    return name;
  }

  public String getDescription() {
    return description;
  }

  public Diet getDiet() {
    return diet;
  }

  public boolean isWild() {
    return wild;
  }

  public double getWeight() {
    return weight;
  }

  public double getFoodToWeightRatio() {
    return foodToWeightRatio;
  }

  @Override
  public Point getPosition() {
    return position;
  }

  /**
   * Menggerakkan hewan ke posisi baru dan memberitahu semua AnimalMoveEventListener yang
   * terdaftar.
   *
   * @param position Posisi baru dari hewan.
   */
  public void setPosition(Point position) {
    Point oldPosition = this.position;
    this.position = position;
    for (AnimalMoveEventListener listener : animalMoveEventListeners) {
      listener.onAnimalMove(this, oldPosition);
    }
  }

  public List<Class<? extends Animal>> getPreys() {
    return preys;
  }

  /**
   * Menambahkan prey pada daftar mangsa.
   *
   * @param prey Kelas dari mangsa.
   */
  public void addPrey(Class<? extends Animal> prey) {
    preys.add(prey);
  }

  /**
   * Memeriksa apakah prey adalah mangsa dari hewan ini.
   *
   * @param prey Kelas mangsa.
   * @return true jika preyName terdapat pada preys dan false jika tidak.
   */
  public boolean isPrey(Class<? extends Animal> prey) {
    return preys.contains(prey);
  }

  /**
   * Memeriksa apakah hewan ini cocok dengan habitat tertentu.
   *
   * @param habitatType Habitat yang akan diperiksa kecocokannya.
   * @return true jika cocok, false jika tidak.
   */
  public boolean isValidHabitat(HabitatType habitatType) {
    switch (habitatType) {
      case AirHabitat:
        return this instanceof AirAnimal;
      case LandHabitat:
        return this instanceof LandAnimal;
      case WaterHabitat:
        return this instanceof WaterAnimal;
    }
    return false;
  }

  /**
   * Mengembalikan karakter yang merepresentasikan hewan.
   *
   * @return Sebuah karakter yang merepresentasikan hewan.
   */
  public char render() {
    return 'x';
  }

  /**
   * Melakukan interaksi dengan seekor hewan.
   *
   * @return string yang menggambarkan experience yang dapat didengar, dirasakan, atau dilihat
   * seorang pengunjung.
   */
  public abstract String interact();

  /**
   * Mendaftarkan sebuah AnimalMoveEventListener yang akan diberitahu jika posisi Animal ini
   * berubah.
   *
   * @param listener AnimalMoveEventListener yang akan didaftarkan.
   */
  public void addAnimalMoveEventListener(AnimalMoveEventListener listener) {
    animalMoveEventListeners.add(listener);
  }

  /**
   * Menghapus sebuah AnimalMoveEventListener dari daftar listener yang akan diberitahu jika posisi
   * Animal ini berubah. Jika ada beberapa listener, hanya satu yang akan dihapus.
   *
   * @param listener AnimalMoveEventListener yang akan dihapus.
   */
  public void removeAnimalMoveEventListener(AnimalMoveEventListener listener) {
    animalMoveEventListeners.remove(listener);
  }
}
