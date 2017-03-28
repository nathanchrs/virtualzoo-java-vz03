package com.intellizoo.virtualzoo.zoo.animal.aves;

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.chameleon.Chameleon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.cobra.Cobra;
import com.intellizoo.virtualzoo.zoo.animal.reptile.iguana.Iguana;
import com.intellizoo.virtualzoo.zoo.animal.reptile.python.Python;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Eagle.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

/**
 * Kelas Eagle yang merepesentasikan elang.
 *
 * @author Agus Gunawan
 */
public class Eagle extends Aves {

  public Eagle(String name, Point position, double weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.25);
    this.wild = wild;
    this.description = "The eagle is a (generally) large sized bird of prey meaning"
        + " that the eagle is one of the most dominant predators in the"
        + " sky. Eagles are most commonly found in the Northern"
        + " Hemisphere including Europe, Asia and North America."
        + " Eagles are also found on the African continent."
        + " This ovipar animal has land and air as its habitat.";

    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Chameleon.class);
    addPrey(Cobra.class);
    addPrey(Iguana.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan elang.
   *
   * @return Experience yang dirasakan ketika berinteraksi dengan elang.
   */
  public String interact() {
    return "The eagle is eating its food that the zoo keeper gave";
  }
}
