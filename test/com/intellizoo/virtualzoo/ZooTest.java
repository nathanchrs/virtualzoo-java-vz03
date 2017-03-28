package com.intellizoo.virtualzoo;

import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.animal.aves.Owl;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import com.intellizoo.virtualzoo.zoo.cell.park.Park;
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
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
public class ZooTest {

  @Test
  public void testaddZone_noState() {
    Zoo zoo = new Zoo(10, 10);
    Zone zone = new Zone("Zone1");
    zoo.addZone(zone);
    assertTrue(zoo.getZones().get(0) != null);
  }

  @Test
  public void testaddCell_noState() {
    Zoo zoo = new Zoo(10, 10);
    Point p = new Point(5, 5);
    Cell cell = new Park(p, true);
    zoo.addCell(cell, "Park1");
    assertTrue(zoo.getCells().get(0) != null);
  }

  @Test
  public void testaddAnimal_noState() {
    Zoo zoo = new Zoo(10, 10);
    Point p = new Point(5, 5);
    Zone zone = new Cage("Cage1");
    zoo.addZone(zone);
    Cell habitat = new Habitat(p, Habitat.HabitatType.AirHabitat);
    zoo.addCell(habitat, "Cage1");
    Animal animal = new Owl("Owly", p, 100, true);
    zoo.addAnimal(animal, "Cage1");
    assertTrue(((Cage)(zoo.getZones().get(0))).getAnimals().get(0) != null);
  }

  @Test
  public void testcalculateTotalMeat_oneOwl() {
    Zoo zoo = new Zoo(10, 10);
    Point p = new Point(5, 5);
    Zone zone = new Cage("Cage1");
    zoo.addZone(zone);
    Cell habitat = new Habitat(p, Habitat.HabitatType.AirHabitat);
    zoo.addCell(habitat, "Cage1");
    Animal animal = new Owl("Owly", p, 100, true);
    zoo.addAnimal(animal, "Cage1");
    assertEquals(zoo.calculateTotalMeat(), 20, 0.001);
  }

  @Test
  public void testcalculateTotalVegetable_oneOwl() {
    Zoo zoo = new Zoo(10, 10);
    Point p = new Point(5, 5);
    Zone zone = new Cage("Cage1");
    zoo.addZone(zone);
    Cell habitat = new Habitat(p, Habitat.HabitatType.AirHabitat);
    zoo.addCell(habitat, "Cage1");
    Animal animal = new Owl("Owly", p, 100, true);
    zoo.addAnimal(animal, "Cage1");
    assertEquals(zoo.calculateTotalVegetable(), 0, 0.001);
  }
}
