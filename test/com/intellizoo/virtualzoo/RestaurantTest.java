package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.cell.restaurant.Restaurant;
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
 * Nama file         : com.intellizoo.virtualzoo.BarracudaTest.java
 * Tanggal dibuat    : 25/03/2017
 * Tanggal perubahan : 25/03/2017
 * Deskripsi         : -
 */
public class RestaurantTest {

  @Test
  public void testrender_noState() {
    Point p = new Point(5, 5);
    Restaurant restaurant = new Restaurant(p, true);
    assertEquals('r', restaurant.render());
  }

}
