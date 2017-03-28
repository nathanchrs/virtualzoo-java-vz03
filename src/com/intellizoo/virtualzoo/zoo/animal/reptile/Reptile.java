package com.intellizoo.virtualzoo.zoo.animal.reptile;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import java.util.Vector;

// Nama file         : Reptile.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas abstrak Reptile yang merepesentasikan kelas hewan Reptil.
 * @author Agus Gunawan
 */
public abstract class Reptile extends Animal {
  /**
   * Menciptakan Reptil yang memiliki skinType "Scales" dan reproduction "Ovipar".
   * @param name Nama hewan.
   */
  public Reptile(String name) {
    this.name = name;
    skinType = Animal.SkinType.Scales;
    reproduction = Animal.Reproduction.Ovipar;
    preys = new Vector<String>();
  }
}
