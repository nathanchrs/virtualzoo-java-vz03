package com.intellizoo.virtualzoo.zoo.animal.reptile.python;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.diet.carnivore.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Reptile;

// Nama file         : Python.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas Python yang merepesentasikan ular piton.
 * @author Agus Gunawan
 */
public class Python extends Reptile {
  /**
   * Menciptakan seekor ular piton dengan posisi, berat, dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi ular piton.
   * @param weight berat ular piton.
   * @param wild Kelakuan ular piton.
   */
  public Python(Point pos, int weight, boolean wild) {
    super("Python");
    diet = new Carnivore(weight, 0.2);
    description = "Pythons are one of the largest snakes. Unlike many other" +
                  " snake species, pythons don’t produce venom. Pythons are constrictors." +
                  " They kill their prey by squeezing them until they stop breathing." +
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
    addPrey("Cobra");
    addPrey("Chameleon");
    addPrey("Iguana");
    addPrey("KomodoDragon");
  }

  /**
   * Melakukan interaksi dengan ular piton.
   * @return Experience yang dirasakan ketika berinteraksi dengan ular piton.
   */
  public String interact() {
    return "The python is squeezing a chicken that the zookeper gave";
  }
}
