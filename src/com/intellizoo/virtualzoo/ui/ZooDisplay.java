package com.intellizoo.virtualzoo.ui;
/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : ZooDisplay.java
 * Tanggal dibuat    : 3/28/17
 * Tanggal perubahan : 3/28/17
 */

import com.intellizoo.virtualzoo.point.Point;
import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.zone.Cage;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.List;
import javax.swing.BorderFactory;
import javax.swing.JPanel;

/**
 * Kelas yang merupakan tempat menggambar tampilan Zoo pada GUI.
 *
 * @author Jonathan Christopher
 */
public class ZooDisplay extends JPanel {

  private static final int ZOO_CELL_WIDTH = 20;
  private static final int ZOO_CELL_HEIGHT = 20;

  private Zoo zoo = null;

  public ZooDisplay() {
    setBorder(BorderFactory.createLineBorder(Color.black));
  }

  public Zoo getZoo() {
    return zoo;
  }

  public void setZoo(Zoo zoo) {
    this.zoo = zoo;
  }

  public Dimension getPreferredSize() {
    if (zoo == null) {
      return new Dimension(300, 200);
    } else {
      return new Dimension(zoo.getCols() * ZOO_CELL_WIDTH, zoo.getRows() * ZOO_CELL_HEIGHT);
    }
  }

  public void paintComponent(Graphics graphics) {
    super.paintComponent(graphics);

    if (zoo == null) {
      graphics.drawString("No zoo loaded.", 10, 20);
      return;
    }

    List<Cell> cells = zoo.getCells();

    // Draw all cells
    for (int row = 0; row < zoo.getRows(); row++) {
      for (int col = 0; col < zoo.getCols(); col++) {
        graphics.drawString("" + cells.get(row * zoo.getCols() + col).render(),
            col * ZOO_CELL_WIDTH, row * ZOO_CELL_HEIGHT);
      }
    }

    /*List<Zone> zones = zoo.getZones();
    for (Zone cage : zones) {
      if (cage instanceof Cage) {
        // Redraw cells that are inside a cage
        List<Cell> cageCells = cage.getCells();
        for (Cell cell : cageCells) {
          Point cageCellsPos = cell.getPosition();
          if (cageCellsPos.getRow() >= topLeft.getRow()
              && cageCellsPos.getCol() >= topLeft.getCol()
              && cageCellsPos.getRow() <= bottomRight.getRow()
              && cageCellsPos.getCol() <= bottomRight.getCol()) {
            fb.drawPoint(cageCellsPos.subtract(topLeft).translate(gridOffset),
                Character.toUpperCase(cell.render()),
                FrameBuffer.Color.WHITE, FrameBuffer.Color.BLACK);
          }
        }

        // Draw animals
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          Point animalPos = animal.getPosition();
          if (animalPos.getRow() >= topLeft.getRow()
              && animalPos.getCol() >= topLeft.getCol()
              && animalPos.getRow() <= bottomRight.getRow()
              && animalPos.getCol() <= bottomRight.getCol()) {
            fb.drawPoint(animalPos.subtract(topLeft).translate(gridOffset),
                animal.render(), FrameBuffer.Color.YELLOW,
                FrameBuffer.Color.BLACK);
          }
        }
      }
    }*/

  }
}
