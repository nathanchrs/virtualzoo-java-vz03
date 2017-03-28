package com.intellizoo.virtualzoo.zoo.animal.aves;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Herbivore;

// Nama file         : Parrot.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Parrot yang merepesentasikan burung beo.
 * @author Agus Gunawan
 */
public class Parrot extends Aves {
  /**
   * Menciptakan seekor burung beo dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi burung beo.
   * @param weight berat burung beo.
   * @param wild Kelakuan burung beo.
   */
  public Parrot(Point pos, int weight, boolean wild) {
    super("Parrot");
    diet = new Herbivore(weight, 0.05);
    description = "Parrot is an animal that can be found in South America" +
                  " and Australasia. Parrots are intelligent birds. They have" +
                  " relatively large brains, they can learn, and they can use" +
                  " simple tools. This ovipar animal has land and air as its" +
                  " habitat.";
    airAnimal = true;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
  }

  /**
   * Melakukan interaksi dengan burung beo.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung beo.
   */
  public String interact() {
    return "The parrot is imitating someone's voice that said 'I'm handsome!'";
  }
}
