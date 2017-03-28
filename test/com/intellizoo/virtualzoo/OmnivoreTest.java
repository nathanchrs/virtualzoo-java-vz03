package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.animal.diet.Diet;
import com.intellizoo.virtualzoo.zoo.animal.diet.Omnivore;
import org.junit.Test;

import static org.junit.Assert.*;
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
 */
public class OmnivoreTest {

  @Test
  public void testcalculateTotalMeatNeeded_noState() {
    Diet diet = new Omnivore(100, 0.5);
    assertEquals(25, diet.calculateTotalMeatNeeded(), 0.001);
  }

  @Test
  public void testcalculateTotalVegetableNeeded_noState() {
    Diet diet = new Omnivore(100, 0.5);
    assertEquals(25, diet.calculateTotalVegetableNeeded(), 0.001);
  }
}