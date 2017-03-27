package com.intellizoo.virtualzoo.zoo.animal.aves.parrot;

import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.aves.Aves;
import com.intellizoo.virtualzoo.zoo.animal.diet.herbivore.Herbivore;

/**
 * Created by aegis on 26/03/17.
 */

/** @class Parrot
 * Kelas Parrot yang merepesentasikan burung beo.
 */
public class Parrot extends Aves {
  /** @brief Constructor.
   * @details Menciptakan seekor burung beo dengan posisi, berat,
   * dan kelakuan (buas atau jinak) yang ditentukan.
   * @param pos Posisi burung beo.
   * @param weight berat burung beo.
   * @param wild Kelakuan burung beo.
   */
  public Parrot(Point pos, int weight, boolean wild) {
    super("Parrot");
    diet = new Herbivore(weight, 0.05);
    description = "Parrot is an animal that can be found in South America" +
                  " and Australasia. Parrots are intelligent birds. They have" +
                  " relatively large brains, they can learn, and they can use" +
                  " simple tools. This ovipar animal has land and air as its" +
                  " habitat.";
    air_animal = true;
    land_animal = true;
    water_animal = false;
    position = pos;
    this.wild = wild;
  }

  /** @brief Melakukan interaksi dengan burung beo.
   * @return Experience yang dirasakan ketika berinteraksi dengan burung beo.
   */
  public String Interact() {
    return "The parrot is imitating someone's voice that said 'I'm handsome!'";
  }

  /** @brief Mengembalikan pointer ke objek burung beo baru yang dibuat secara dinamis.
   * @return Pointer ke objek burung beo yang baru dibuat.
   */

}
