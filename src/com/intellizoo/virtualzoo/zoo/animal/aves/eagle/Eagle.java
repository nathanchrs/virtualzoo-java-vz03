package com.intellizoo.virtualzoo.zoo.animal.aves.eagle;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;

// Nama file         : Eagle.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Eagle yang merepesentasikan elang.
 * @author Agus Gunawan
 */
public class Eagle extends Aves {
  /**
   * Menciptakan seekor elang dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi elang.
   * @param weight berat elang.
   * @param wild Kelakuan elang.
   */
  public Eagle(Point pos, int weight, boolean wild) {
    super("Eagle");
    diet = new Carnivore(weight, 0.25);
    description = "The eagle is a (generally) large sized bird of prey meaning" +
                  " that the eagle is one of the most dominant predators in the" +
                  " sky. Eagles are most commonly found in the Northern" +
                  " Hemisphere including Europe, Asia and North America." +
                  " Eagles are also found on the African continent." +
                  " This ovipar animal has land and air as its habitat";
    airAnimal = true;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
    addPrey("Owl");
    addPrey("Parrot");
    addPrey("Peacock");
    addPrey("Pigeon");
    addPrey("Chameleon");
    addPrey("Cobra");
    addPrey("Iguana");
    addPrey("Python");
  }

  /**
   * Melakukan interaksi dengan elang.
   * @return Experience yang dirasakan ketika berinteraksi dengan elang.
   */
  public String interact() {
    return "The eagle is eating its food that the zoo keeper gave";
  }
}
