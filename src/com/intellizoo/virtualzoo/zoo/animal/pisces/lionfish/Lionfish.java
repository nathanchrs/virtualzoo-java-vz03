package com.intellizoo.virtualzoo.zoo.animal.pisces.lionfish;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Pisces;

// Nama file         : Lionfish.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Lionfish yang merepesentasikan lionfish.
 * @author Agus Gunawan
 */
public class Lionfish extends Pisces {
  /**
   * Menciptakan seekor lionfish dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi lionfish.
   * @param weight berat lionfish.
   * @param wild Kelakuan lionfish.
   */
  public Lionfish(Point pos, int weight, boolean wild) {
    super("Lionfish");
    diet = new Carnivore(weight, 0.1);
    description = "Lionfish is an animal native to the Indo-Pacific. It is" +
                  " characterized by conspicuous warning coloration and venomous" +
                  " spiky fin rays. This ovipar animal has water as its habitat.";
    airAnimal = false;
    landAnimal = false;
    waterAnimal = true;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan lionfish.
   * @return Experience yang dirasakan ketika berinteraksi dengan lionfish.
   */
  public String interact() {
    return "Whoa! I thought it was plant. It is lionfish!";
  }
}
