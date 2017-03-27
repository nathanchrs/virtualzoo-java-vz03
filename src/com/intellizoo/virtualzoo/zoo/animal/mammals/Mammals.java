package com.intellizoo.virtualzoo.zoo.animal.mammals;

/**
 * Created by aegis on 26/03/17.
 */
import com.intellizoo.virtualzoo.zoo.animal.Animal;

import static com.intellizoo.virtualzoo.zoo.animal.Animal.Reproduction.Vivipar;
import static com.intellizoo.virtualzoo.zoo.animal.Animal.SkinType.Fur;

/** @class Mammals
 * Kelas abstrak Mammals yang merepesentasikan kelas hewan Mamalia.
 */
public abstract class Mammals extends Animal {

  /** @brief Constructor.
   * Menciptakan Mamalia yang memiliki skinType "Fur" dan reproduction "Vivipar".
   * @param name Nama hewan
   */
  public Mammals(String name) {
    this.name = name;
    skin_type = Fur;
    reproduction = Vivipar;
  }
}
