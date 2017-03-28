package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.pisces.Seahorse;
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
public class SeahorseTest {

  @Test
  public void testinteract_noState() {
    Point p = new Point(5, 5);
    Animal animal = new Seahorse("Seahorsey", p, 100, true);
    assertEquals("The seahorse is camouflaging, preparing to ambush its prey", animal.interact());
  }
}