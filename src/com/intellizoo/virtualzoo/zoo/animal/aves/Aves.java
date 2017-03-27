
package com.intellizoo.virtualzoo.zoo.animal.aves;

import com.intellizoo.virtualzoo.zoo.animal.Animal;

import static com.intellizoo.virtualzoo.zoo.animal.Animal.Reproduction.Ovipar;
import static com.intellizoo.virtualzoo.zoo.animal.Animal.SkinType.Feather;
/**
 * Created by aegis on 26/03/17.
 */

/** @class Aves
 * Kelas abstrak Aves yang merepesentasikan kelas hewan Aves.
 */
public abstract class Aves extends Animal {

  /**
   * @brief Constructor.
   * @details Menciptakan Aves yang
   * memiliki skinType "Feather" dan reproduction "Ovipar".
   * @param name Nama hewan.
   */
  public Aves(String name) {
    this.name = name;
    skin_type = Feather;
    reproduction = Ovipar;
  }

}
