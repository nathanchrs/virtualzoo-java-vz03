package com.intellizoo.virtualzoo;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.Owl;
import com.intellizoo.virtualzoo.zoo.animal.Leopard;
import com.intellizoo.virtualzoo.zoo.animal.Cobra;
import com.intellizoo.virtualzoo.zoo.cell.Habitat;
import org.junit.Test;


/**
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - intellizoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.AnimalTest.java
 * Tanggal dibuat    : 25/03/2017
 * Tanggal perubahan : 25/03/2017
 * Deskripsi         : -
 *
 * @author : Agus Gunawan
 */

public class AnimalTest {

  @Test
  public void testaddPrey_noPrey()throws Exception {
    Point p = new Point(5, 5);
    Animal animal = new Owl("Owly", p, 100, true);
    animal.addPrey(Cobra.class);
    assertTrue(animal.isPrey(Cobra.class));
  }

  @Test
  public void testisValidHabitat_oneHabitat() throws Exception {
    Point p = new Point(5, 5);
    Animal animal = new Leopard("Leoly", p, 100, true);
    assertTrue(animal.isValidHabitat(Habitat.HabitatType.LandHabitat));
  }

  @Test
  public void testisValidHabitat_twoHabitat() throws Exception {
    Point p = new Point(5, 5);
    Animal animal = new Owl("Owly", p, 100, true);
    assertTrue(animal.isValidHabitat(Habitat.HabitatType.LandHabitat));
    assertTrue(animal.isValidHabitat(Habitat.HabitatType.AirHabitat));
  }

  @Test
  public void testrender_noState() throws Exception {
    Point p = new Point(5, 5);
    Animal animal = new Owl("Owly", p, 100, true);
    assertEquals('x', animal.render());
  }
}