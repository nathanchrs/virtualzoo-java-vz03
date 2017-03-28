package com.intellizoo.virtualzoo.zoo.animal;
/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : AnimalBehavior.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import com.intellizoo.virtualzoo.Point;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.cell.habitat.Habitat;
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * Kelas perilaku hewan yang akan dijalankan pada sebuah thread tersendiri untuk sebuah hewan.
 *
 * @author Jonathan Christopher
 */
public class AnimalBehavior implements Runnable {

  private static final long BEHAVIOR_TICK = 1000;

  private Animal animal;
  private Cage cage;
  private Random rand = new Random();

  public AnimalBehavior(Animal animal, Cage cage) {
    this.animal = animal;
    this.cage = cage;
  }

  /**
   * Perilaku yang akan dijalankan di thread untuk hewan ini.
   */
  @Override
  public void run() {

    while (!Thread.interrupted()) {
      try {
        Thread.sleep(BEHAVIOR_TICK);
      } catch (InterruptedException e) {
        // Thread terinterupsi, stop thread sekarang.
        return;
      }

      // Cari posisi yang dapat didatangi hewan selanjutnya berada di sisi posisi saat ini
      // (Habitatnya harus sesuai dengan jenis hewan)
      Point destinationPoints[] = cage.getCells().stream()
          .filter(c -> c instanceof Habitat && animal.isValidHabitat(((Habitat) c).getType()))
          .map(Cell::getPosition)
          .filter(point -> point.distanceTo(animal.getPosition()) == 1)
          .toArray(Point[]::new);

      Point nextPoint = animal.getPosition();
      if (destinationPoints.length > 0) {
        nextPoint = destinationPoints[rand.nextInt(destinationPoints.length)];
      }
      animal.setPosition(nextPoint);
    }
  }
}
