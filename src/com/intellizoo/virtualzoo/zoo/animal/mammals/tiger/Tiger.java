package com.intellizoo.virtualzoo.zoo.animal.mammals.tiger;
import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.mammals.Mammals;

// Nama file         : Tiger.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Tiger yang merepesentasikan harimau.
 * @author Agus Gunawan
 */
public class Tiger extends Mammals {
  /**
   * Menciptakan seekor harimau dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi harimau.
   * @param weight berat harimau.
   * @param wild Kelakuan harimau.
   */
  public Tiger(Point pos, int weight, boolean wild) {
    super("Tiger");
    diet = new Carnivore(weight, 0.1);
    description = "Tiger is an animal from Turkey through South and" +
                  " Southeast Asia. The tiger (Panthera tigris) is the" +
                  " largest cat species, most recognisable for their pattern" +
                  " of dark vertical stripes on reddish-orange" +
                  " fur with a lighter underside. The tiger is wild animal" +
                  " and mostly nocturnal. This vivipar animal" +
                  " has land as its habitat.";
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
    addPrey("Lion");
    addPrey("Orangutan");
    addPrey("Chameleon");
    addPrey("Cobra");
    addPrey("Iguana");
    addPrey("KomodoDragon");
    addPrey("Python");

  }

  /**
   * Melakukan interaksi dengan harimau.
   * @return Experience yang dirasakan ketika berinteraksi dengan harimau.
   */
  public String interact() {
    return "The tiger is roaring. The sound that tiger produce is rawwrrrrr!";
  }
}
