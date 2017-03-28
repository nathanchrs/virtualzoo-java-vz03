package com.intellizoo.virtualzoo;

import static junit.framework.TestCase.assertEquals;

import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import org.junit.Test;


/**
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - intellizoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.HabitatTest.java
 * Tanggal dibuat    : 28/03/2017
 * Tanggal perubahan : 28/03/2017
 * Deskripsi         : -
 *
 * @author : Agus Gunawan
 */
public class HabitatTest {

  @Test
  public void testrender_airHabitat() {
    Point p = new Point(5, 5);
    Habitat habitat = new Habitat(p, Habitat.HabitatType.AirHabitat);
    assertEquals('a', habitat.render());
  }

  @Test
  public void testrender_landHabitat() {
    Point p = new Point(5, 5);
    Habitat habitat = new Habitat(p, Habitat.HabitatType.LandHabitat);
    assertEquals('l', habitat.render());
  }

  @Test
  public void testrender_waterHabitat() {
    Point p = new Point(5, 5);
    Habitat habitat = new Habitat(p, Habitat.HabitatType.WaterHabitat);
    assertEquals('w', habitat.render());
  }
}
