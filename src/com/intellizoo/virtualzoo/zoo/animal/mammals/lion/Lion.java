package com.intellizoo.virtualzoo.zoo.animal.mammals.lion;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

// Nama file         : Lion.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Lion yang merepesentasikan singa.
 * @author Agus Gunawan
 */
public class Lion extends Mammals {
  /**
   * Menciptakan seekor singa dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi singa.
   * @param weight berat singa.
   * @param wild Kelakuan singa.
   */
  public Lion(Point pos, int weight, boolean wild) {
    super("Lion");
    diet = new Carnivore(weight, 0.15);
    description = "Lion is an animal from Africa. It is the second-largest living" +
                  " cat after the tiger with habit of sleeping during the day and" +
                  " active primarily at night. This vivipar animal has land as" +
                  " its habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
    addPrey("Eagle");
    addPrey("Owl");
    addPrey("Parrot");
    addPrey("Peacock");
    addPrey("Pigeon");
    addPrey("Gorilla");
    addPrey("Leopard");
    addPrey("Orangutan");
    addPrey("Tiger");
    addPrey("Chameleon");
    addPrey("Cobra");
    addPrey("Iguana");
    addPrey("KomodoDragon");
    addPrey("Python");
  }

  /**
   * Melakukan interaksi dengan singa.
   * @return Experience yang dirasakan ketika berinteraksi dengan singa.
   */
  public String interact() {
    return "The lion is yawning";
  }
}
