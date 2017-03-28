package com.intellizoo.virtualzoo;

import static junit.framework.TestCase.assertEquals;

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.cell.Road;
import org.junit.Test;

/**
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - intellizoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.RoadTest.java
 * Tanggal dibuat    : 28/03/2017
 * Tanggal perubahan : 28/03/2017
 * Deskripsi         : -
 *
 * @author : Agus Gunawan
 */
public class RoadTest {

  @Test
  public void testrender_noState() {
    Point p = new Point(5, 5);
    Road road = new Road(p, true, true, true);
    assertEquals('.', road.render());
  }
}
