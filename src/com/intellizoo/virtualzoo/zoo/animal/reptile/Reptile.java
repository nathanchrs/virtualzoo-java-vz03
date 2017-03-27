package com.intellizoo.virtualzoo.zoo.animal.reptile;

import com.intellizoo.virtualzoo.zoo.animal.Animal;

import static com.intellizoo.virtualzoo.zoo.animal.Animal.Reproduction.Ovipar;
import static com.intellizoo.virtualzoo.zoo.animal.Animal.SkinType.Scales;

/**
 * Created by aegis on 26/03/17.
 */
public abstract class Reptile extends Animal {
  /** @brief Constructor.
   * Menciptakan Reptil yang memiliki skinType "Scales" dan reproduction "Ovipar".
   * @param name Nama hewan.
   */
  public Reptile(String name) {
    this.name = name;
    skin_type = Scales;
    reproduction = Ovipar;
  }
}
