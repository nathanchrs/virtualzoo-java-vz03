package com.intellizoo.virtualzoo.zoo.animal.mammals.leopard;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

// Nama file         : Leopard.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Leopard yang merepesentasikan macan tutul.
 * @author Agus Gunawan
 */
public class Leopard extends Mammals {
  /**
   * Menciptakan seekor macan tutul dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi macan tutul.
   * @param weight berat macan tutul.
   * @param wild Kelakuan macan tutul.
   */
  public Leopard(Point pos, int weight, boolean wild) {
    super("Leopard");
    diet = new Carnivore(weight, 0.05);
    description = "Leopard is an animal from Africa and Asia. It is one of " +
                  " five 'big cats' with ability to adapt to various habitats and" +
                  " could run at speeds of up to 58 kmph. This vivipar animal has" +
                  " land as its habitat.";
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
    addPrey("Lion");
    addPrey("Orangutan");
    addPrey("Tiger");
    addPrey("Chameleon");
    addPrey("Cobra");
    addPrey("Iguana");
    addPrey("KomodoDragon");
    addPrey("Python");
  }

  /**
   * Melakukan interaksi dengan macan tutul.
   * @return Experience yang dirasakan ketika berinteraksi dengan macan tutul.
   */
  public String interact() {
    return "The leopard is sleeping with its family";
  }
}
