package com.intellizoo.virtualzoo.zoo.animal.reptile.iguana;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.omnivore.Omnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

// Nama file         : Iguana.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/** @class Iguana
 * Kelas Iguana yang merepesentasikan iguana.
 * @author Agus Gunawan
 */
public class Iguana extends Reptile {
  /**
   * Menciptakan seekor iguana dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi iguana.
   * @param weight berat iguana.
   * @param wild Kelakuan iguana.
   */
  public Iguana(Point pos, int weight, boolean wild) {
    super("Iguana");
    diet = new Omnivore(weight, 0.1);
    description = "Iguanas are lizards identified by their stocky stature," +
                  " the saggy skin on their throats and the" +
                  " spines that protrude from their heads, necks," +
                  " backs and tails. Iguanas live 15 to 20 years" +
                  " if cared for properly. The native range of the green iguana" +
                  " extends from southern Mexico to central Brazil.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan iguana.
   * @return Experience yang dirasakan ketika berinteraksi dengan iguana.
   */
  public String interact() {
    return "The iguana is climbing a tree";
  }
}
