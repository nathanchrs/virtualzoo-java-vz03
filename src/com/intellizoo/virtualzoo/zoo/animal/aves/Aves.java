package com.intellizoo.virtualzoo.zoo.animal.aves;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import java.util.Vector;

// Nama file         : Aves.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas abstrak Aves yang merepesentasikan kelas hewan Aves.
 * @author Agus Gunawan
 */
public abstract class Aves extends Animal {
  /**
   * Menciptakan Aves yang memiliki skinType "Feather" dan reproduction "Ovipar".
   * @param name Nama hewan.
   */
  public Aves(String name) {
    this.name = name;
    skinType = Animal.SkinType.Feather;
    reproduction = Animal.Reproduction.Ovipar;
    preyList = new Vector<String>();
  }
}
