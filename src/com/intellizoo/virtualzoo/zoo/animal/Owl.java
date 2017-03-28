package com.intellizoo.virtualzoo.zoo.animal;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;

// Nama file         : Owl.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Owl yang merepesentasikan burung hantu.
 *
 * @author Agus Gunawan
 */
public class Owl extends Aves implements AirAnimal, LandAnimal {

  /**
   * Menciptakan seekor burung hantu dengan nama, posisi, berat, dan kelakuan (buas atau jinak) yang
   * ditentukan.
   *
   * @param name Nama burung hantu.
   * @param position Posisi burung hantu.
   * @param weight berat burung hantu.
   * @param wild Kelakuan burung hantu.
   */
  public Owl(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.2);
    this.wild = wild;
    this.description = "Owls possess large, forward-facing eyes and ear-holes, a"
        + " hawk-like beak, a flat face, and usually a "
        + " conspicuous circle of feathers, a facial disc, around each"
        + " eye. Owls can rotate their heads and necks as much as 270°."
        + " This ovipar animal has land and air as its habitat";
  }

  /**
   * Melakukan interaksi dengan burung hantu.
   *
   * @return Experience yang dirasakan ketika berinteraksi dengan burung hantu.
   */
  public String interact() {
    return "Owls rotate their heads and make 'kuk kuk' sound";
  }
}
