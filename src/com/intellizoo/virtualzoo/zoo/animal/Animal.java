package com.intellizoo.virtualzoo.zoo.animal;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.renderer.renderable.Renderable;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import java.util.Vector;

// Nama file         : Animal.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas abstrak Animal yang merepesentasikan seekor hewan.
 * @author Agus Gunawan
 */
public abstract class Animal implements Renderable {
  /**
   * Jenis-jenis cara reproduksi hewan.
   */
  public enum Reproduction { Ovipar, Vivipar, Ovovivipar };

  /**
   * Jenis-jenis penutup tubuh (kulit) hewan.
   */
  public enum SkinType { Feather, Fur, Scales }

  protected String name;
  protected Reproduction reproduction;
  protected SkinType skinType;
  protected String description;
  protected boolean airAnimal;
  protected boolean landAnimal;
  protected boolean waterAnimal;
  protected boolean wild;
  protected Vector<String> preyList;
  protected Point position;
  protected Diet diet;

  // Getter & Setter
  public String getName() {
    return name;
  }

  public Reproduction getReproduction() {
    return reproduction;
  }

  public SkinType getSkinType() {
    return skinType;
  }

  public String getDescription() {
    return description;
  }

  public Point getPosition() {
    return position;
  }

  public void setPosition(Point position) {
    this.position = position;
  }

  public Diet getDiet() {
    return diet;
  }

  public boolean isWild() {
    return wild;
  }

  /**
   * Menambahkan nama mangsa pada daftar mangsa.
   * @param preyName Nama mangsa.
   */
  public void addPrey(String preyName) {
    preyList.addElement(preyName);
  }

  /**
   * Memeriksa apakah preyName terdapat pada preyList.
   * @param preyName Nama mangsa.
   * @return true jika preyName terdapat pada preyList dan false jika tidak.
   */
  public boolean isPrey(String preyName) {
    return preyList.contains(preyName);
  }

  /**
   * Memeriksa apakah hewan ini cocok dengan habitat tertentu.
   * @param habitatType Habitat yang akan diperiksa kecocokannya.
   * @return true jika cocok, false jika tidak.
   */
  public boolean isValidHabitat(Habitat.HabitatType habitatType) {
    switch (habitatType){
      case AirHabitat:
        return airAnimal;
      case LandHabitat:
        return landAnimal;
      case WaterHabitat:
        return waterAnimal;
    }
    return false;
  }


  /**
   * Mengembalikan karakter yang merepresentasikan hewan.
   * @return Sebuah karakter yang merepresentasikan hewan.
   */
  public char render() {
    return 'x';
  }

  /**
   * Melakukan interaksi dengan seekor hewan.
   * @return string yang menggambarkan experience yang dapat didengar,
   * dirasakan, atau dilihat seorang pengunjung.
   */
  public abstract String interact();
}
