package com.intellizoo.virtualzoo;

import static junit.framework.TestCase.assertEquals;

import com.intellizoo.virtualzoo.zoo.animal.diet.Carnivore;
import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;
import org.junit.Test;

/**
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - intellizoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.CarnivoreTest.java
 * Tanggal dibuat    : 28/03/2017
 * Tanggal perubahan : 28/03/2017
 * Deskripsi         : -
 *
 * @author : Agus Gunawan
 */
public class CarnivoreTest {

  @Test
  public void testcalculateTotalMeatNeeded_noState() {
    Diet diet = new Carnivore(100, 0.5);
    assertEquals(50, diet.calculateTotalMeatNeeded(), 0.001);
  }

  @Test
  public void testcalculateTotalVegetableNeeded_noState() {
    Diet diet = new Carnivore(100, 0.5);
    assertEquals(0, diet.calculateTotalVegetableNeeded(), 0.001);
  }
}