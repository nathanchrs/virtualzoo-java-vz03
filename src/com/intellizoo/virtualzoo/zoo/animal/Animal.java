package com.intellizoo.virtualzoo.zoo.animal;

/**
 * Created by aegis on 26/03/17.
 */

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.renderer.renderable.Renderable;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;

import java.util.Vector;


/** @class Animal
 * Kelas abstrak Animal yang merepesentasikan seekor hewan.
 */
public abstract class Animal implements Renderable {
  /** @enum Reproduction
   * Jenis-jenis hewan menurut cara reproduksi.
   */
  public enum Reproduction { Ovipar, Vivipar, Ovovivipar };

  /** @enum SkinType
   * Jenis-jenis hewan menurut jenis penutup kulit.
   */
  public enum SkinType { Feather, Fur, Scales };

  protected String name;
  protected Reproduction reproduction;
  protected SkinType skin_type;
  protected String description;
  protected boolean air_animal;
  protected boolean land_animal;
  protected boolean water_animal;
  protected boolean wild;
  protected Vector<String> prey_list;
  protected Point position;
  protected Diet diet;

  /** @brief Mengembalikan nama hewan.
   * @return Nama hewan.
   */
  public String GetName() {
    return name;
  }

  /** @brief Mengembalikan deskripsi hewan.
   * @return Deskripsi hewan.
   */
  public String GetDescription() {
    return description;
  }

  /** @brief Mengecek apakah hewan ini cocok dengan habitat tertentu.
   * @param habitat_type Habitat yang akan dicek kecocokannya.
   * @return True jika cocok, false jika tidak.
   */
  public boolean IsValidHabitat(Habitat.HabitatType habitat_type) {
    switch (habitat_type) {
      case AirHabitat:
        return air_animal;
      case LandHabitat:
        return land_animal;
      case WaterHabitat:
        return water_animal;
    }
    return false;
  }

  /** @brief Memeriksa apakah hewan buas atau tidak.
   * @return True jika hewan adalah hewan buas dan False jika tidak.
   */
  public boolean IsWild() {
    return wild;
  }

  /** @brief Menambahkan nama mangsa pada daftar mangsa.
   * @param prey_name Nama mangsa.
   */
  public void AddPrey(String prey_name) {
    prey_list.addElement(prey_name);
  }

  /** @brief Memeriksa apakah preyName terdapat pada preyList.
   * @param prey_name Nama mangsa.
   * @return True jika preyName terdapat pada preyList dan false jika tidak.
   */
  public boolean IsPrey(String prey_name) {
    return prey_list.indexOf(prey_name) >= 0;
  }

  /** @brief Mengembalikan cara reproduksi hewan.
   * @return Cara reproduksi hewan.
   */
  public Reproduction GetReproduction() {
    return reproduction;
  }

  /** @brief Mengembalikan jenis kulit hewan.
   * @return Jenis kulit hewan.
   */
  public SkinType GetSkinType() {
    return skin_type;
  }

  /** @brief Mengembalikan posisi hewan.
   * @return Posisi hewan.
   */
  public Point GetPosition() {
    return position;
  }

  /** @brief Mengeset posisi hewan.
   * @param position Posisi baru hewan
   */
  public void SetPosition(Point position) {
    this.position = position;
  }

  /** @brief Mengembalikan char yang merepresentasikan hewan.
   * @return Sebuah char yang merepresentasikan hewan.
   */
  public char Render() {
    return 'x';
  }

  /** @brief Melakukan interaksi dengan seekor hewan.
   * @details Merupakan pure virtual function.
   * @return string yang menggambarkan experience yang dapat didengar,
   * dirasakan, atau dilihat seorang pengunjung.
   */
  public abstract String Interact();
}
