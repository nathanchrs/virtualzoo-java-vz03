package com.intellizoo.virtualzoo.zoo.animal.pisces;

import com.intellizoo.virtualzoo.zoo.animal.Animal;

import static com.intellizoo.virtualzoo.zoo.animal.Animal.Reproduction.Ovipar;
import static com.intellizoo.virtualzoo.zoo.animal.Animal.SkinType.Scales;

/**
 * Created by aegis on 26/03/17.
 */
public abstract class Pisces extends Animal {

  /** @brief Constructor.
   * Menciptakan Pisces yang memiliki skinType "Scale" dan reproduction "Ovipar".
   */
  public Pisces(String name) {
    this.name = name;
    skin_type = Scales;
    reproduction = Ovipar;
  }

}
