package com.intellizoo.virtualzoo.zoo.animal.reptile.cobra;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

// Nama file         : Cobra.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Cobra yang merepesentasikan ular kobra.
 * @author Agus Gunawan
 */
public class Cobra extends Reptile {
  /**
   * Menciptakan seekor ular kobra dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi ular kobra.
   * @param weight berat ular kobra.
   * @param wild Kelakuan ular kobra.
   */
  public Cobra(Point pos, int weight, boolean wild) {
    super("Cobra");
    diet = new Carnivore(weight, 0.15);
    description = "Cobras, with their threatening hoods and intimidating " +
                  " postures, are some of the most iconic" +
                  " snakes on Earth. Their elegance, prideful stance" +
                  " and venomous bite have made them both respected and" +
                  " feared. Cobras occur throughout Africa," +
                  " the Middle East, India, Southeast Asia, and Indonesia." +
                  " This ovipar animal has land as its habitat.";
    airAnimal = false;
    landAnimal = true;
    waterAnimal = false;
    position = pos;
    this.wild = wild;
    addPrey("Owl");
    addPrey("Parrot");
    addPrey("Peacock");
    addPrey("Pigeon");
    addPrey("Gorilla");
    addPrey("Leopard");
    addPrey("Lion");
    addPrey("Orangutan");
    addPrey("Tiger");
    addPrey("Chameleon");
    addPrey("Iguana");
    addPrey("KomodoDragon");
    addPrey("Python");
  }

  /**
   * Melakukan interaksi dengan ular kobra.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular kobra.
   */
  public String interact() {
    return "The cobra wag its tail and make some sizzle sound like 'Ssssttt!'";
  }

}
