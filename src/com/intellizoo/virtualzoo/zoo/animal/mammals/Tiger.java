package com.intellizoo.virtualzoo.zoo.animal.mammals;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.LandAnimal;
import com.intellizoo.virtualzoo.zoo.animal.aves.*;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Chameleon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Cobra;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Iguana;
import com.intellizoo.virtualzoo.zoo.animal.reptile.KomodoDragon;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Python;

// Nama file         : Tiger.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Tiger yang merepesentasikan harimau.
 * @author Agus Gunawan
 */
public class Tiger extends Mammals implements LandAnimal {
  /**
   * Menciptakan seekor harimau dengan nama, posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   *
   * @param name Nama harimau.
   * @param position Posisi harimau.
   * @param weight berat harimau.
   * @param wild Kelakuan harimau.
   */
  public Tiger(String name, Point position, int weight, boolean wild) {
    this.name = name;
    this.position = position;
    this.diet = new Carnivore(weight, 0.1);
    this.wild = wild;
    this.description = "Tiger is an animal from Turkey through South and"
        + " Southeast Asia. The tiger (Panthera tigris) is the"
        + " largest cat species, most recognisable for their pattern"
        + " of dark vertical stripes on reddish-orange"
        + " fur with a lighter underside. The tiger is wild animal"
        + " and mostly nocturnal. This vivipar animal"
        + " has land as its habitat.";
    addPrey(Eagle.class);
    addPrey(Owl.class);
    addPrey(Parrot.class);
    addPrey(Peacock.class);
    addPrey(Pigeon.class);
    addPrey(Gorilla.class);
    addPrey(Leopard.class);
    addPrey(Lion.class);
    addPrey(Orangutan.class);
    addPrey(Chameleon.class);
    addPrey(Cobra.class);
    addPrey(Iguana.class);
    addPrey(KomodoDragon.class);
    addPrey(Python.class);
  }

  /**
   * Melakukan interaksi dengan harimau.
   * @return Experience yang dirasakan ketika berinteraksi dengan harimau.
   */
  public String interact() {
    return "The tiger is roaring. The sound that tiger produce is rawwrrrrr!";
  }
}
