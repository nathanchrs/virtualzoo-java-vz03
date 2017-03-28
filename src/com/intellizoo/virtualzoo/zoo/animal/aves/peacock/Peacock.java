package com.intellizoo.virtualzoo.zoo.animal.aves.peacock;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.omnivore.Omnivore;

// Nama file         : Peacock.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Peacock yang merepesentasikan burung merak.
 * @author Agus Gunawan
 */
public class Peacock extends Aves {
  /**
   * Menciptakan seekor burung merak dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi burung merak.
   * @param weight berat burung merak.
   * @param wild Kelakuan burung merak.
   */
  public Peacock(Point pos, int weight, boolean wild) {
    super("Peacock");
    diet = new Omnivore(weight, 0.15);
    description = "The Peacock is found in many locations including Burma, Indian," +
                  " and Sri Lanka. The main body of the Peacock is bluish green in color." +
                  " Peacock has colorful tail. The colorful tail of the Peacock is fanned" +
                  " out to be able to show dominance and for the purpose of attracting a" +
                  " mate. This ovipar animal has land as its habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan burung merak.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung merak.
   */
  public String interact() {
    return "The peacock is spreading its tail";
  }
}
