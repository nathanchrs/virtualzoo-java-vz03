package com.intellizoo.virtualzoo.zoo.animal.mammals;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import java.util.Vector;

// Nama file         : Mammals.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas abstrak Mammals yang merepesentasikan kelas hewan Mamalia.
 * @author Agus Gunawan
 */
public abstract class Mammals extends Animal {
  /**
   * Menciptakan Mamalia yang memiliki skinType "Fur" dan reproduction "Vivipar".
   * @param name Nama hewan
   */
  public Mammals(String name) {
    this.name = name;
    skinType = Animal.SkinType.Fur;
    reproduction = Animal.Reproduction.Vivipar;
    preys = new Vector<String>();
  }
}
