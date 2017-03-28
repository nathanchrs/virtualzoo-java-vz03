package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.reptile.Cobra;
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
public class CobraTest {

  @Test
  public void testinteract_noState() {
    Point p = new Point(5, 5);
    Animal animal = new Cobra("Cobray", p, 100, true);
    assertEquals("The cobra wag its tail and make some sizzle sound like 'Ssssttt!'",
                  animal.interact());
  }
}
