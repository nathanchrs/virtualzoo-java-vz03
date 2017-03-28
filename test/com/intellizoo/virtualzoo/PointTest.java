package com.intellizoo.virtualzoo;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertFalse;
import static org.junit.Assert.assertTrue;

import com.intellizoo.virtualzoo.point.Point;
import org.junit.Test;

/**
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - intellizoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : com.intellizoo.virtualzoo.PointTest.java
 * Tanggal dibuat    : 28/03/2017
 * Tanggal perubahan : 28/03/2017
 * Deskripsi         : -
 *
 * @author : Agus Gunawan
 */
public class PointTest {

  @Test
  public void testinArea_true() {
    Point p = new Point(5, 5);
    assertTrue(p.inArea(6, 6));
  }

  @Test
  public void testinArea_false() {
    Point p = new Point(5, 5);
    assertFalse(p.inArea(5, 5));
  }

  @Test
  public void testtranslate_somePoint() {
    Point p = new Point();
    Point p2 = new Point(5, 5);
    Point p3 = new Point();
    p3 = p.translate(p2);
    assertEquals(5, p3.getCol());
    assertEquals(5, p3.getRow());
  }

  @Test
  public void testsubtract_somePoint() {
    Point p = new Point();
    Point p2 = new Point(5, 5);
    Point p3 = new Point();
    p3 = p.subtract(p2);
    assertEquals(-5, p3.getRow());
    assertEquals(-5, p3.getCol());
  }

  @Test
  public void testequal_same() {
    Point p = new Point(5, 5);
    Point p2 = new Point(5, 5);
    assertTrue(p.equals(p2));
  }

  @Test
  public void testequal_notSame() {
    Point p = new Point(5, 5);
    Point p2 = new Point(6, 6);
    assertFalse(p.equals(p2));
  }
}
