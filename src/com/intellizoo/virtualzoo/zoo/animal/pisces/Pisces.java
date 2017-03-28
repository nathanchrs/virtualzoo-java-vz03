package com.intellizoo.virtualzoo.zoo.animal.pisces;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import java.util.Vector;

// Nama file         : Pisces.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas abstrak Pisces yang merepesentasikan kelas hewan Pisces.
 * @author Agus Gunawan
 */
public abstract class Pisces extends Animal {
  /**
   * Menciptakan Pisces yang memiliki skinType "Scale" dan reproduction "Ovipar".
   */
  public Pisces(String name) {
    this.name = name;
    skinType = Animal.SkinType.Scales;
    reproduction = Animal.Reproduction.Ovipar;
    preys = new Vector<String>();
  }

}
