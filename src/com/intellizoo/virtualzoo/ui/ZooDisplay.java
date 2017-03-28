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
import com.intellizoo.virtualzoo.zoo.cell.Habitat;
import com.intellizoo.virtualzoo.zoo.cell.Habitat.HabitatType;
import com.intellizoo.virtualzoo.zoo.cell.Park;
import com.intellizoo.virtualzoo.zoo.cell.Restaurant;
import com.intellizoo.virtualzoo.zoo.cell.Road;
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

  private Zoo zoo;

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
        Cell cell = cells.get(row * zoo.getCols() + col);

        if (cell instanceof Habitat) {
          if (((Habitat) cell).getType().equals(HabitatType.AirHabitat)) {
            graphics.setColor(Color.cyan);
          } else if (((Habitat) cell).getType().equals(HabitatType.LandHabitat)) {
            graphics.setColor(Color.orange);
          } else if (((Habitat) cell).getType().equals(HabitatType.WaterHabitat)) {
            graphics.setColor(Color.blue);
          } else {
            continue;
          }
        } else if (cell instanceof Park) {
          graphics.setColor(Color.green);
        } else if (cell instanceof Restaurant) {
          graphics.setColor(Color.red);
        } else if (cell instanceof Road) {
          graphics.setColor(Color.lightGray);
        } else {
          continue;
        }

        graphics.fillRect(
            col * ZOO_CELL_WIDTH + 1,
            row * ZOO_CELL_HEIGHT + 1,
            ZOO_CELL_WIDTH - 2,
            ZOO_CELL_HEIGHT - 2
        );
      }
    }

    List<Zone> zones = zoo.getZones();
    for (Zone cage : zones) {
      if (cage instanceof Cage) {
        // Give borders to cells that are inside a cage
        List<Cell> cageCells = cage.getCells();
        for (Cell cell : cageCells) {
          Point cageCellsPos = cell.getPosition();
          if (cageCellsPos.inArea(zoo.getRows(), zoo.getCols())) {
            graphics.setColor(Color.gray);
            graphics.drawRect(
                cageCellsPos.getCol() * ZOO_CELL_WIDTH,
                cageCellsPos.getRow() * ZOO_CELL_HEIGHT,
                ZOO_CELL_WIDTH,
                ZOO_CELL_HEIGHT
            );
          }
        }

        // Draw animals
        List<Animal> animals = ((Cage) cage).getAnimals();
        for (Animal animal : animals) {
          Point animalPos = animal.getPosition();
          if (animalPos.inArea(zoo.getRows(), zoo.getCols())) {
            graphics.setColor(Color.black);
            graphics.fillOval(
                animalPos.getCol() * ZOO_CELL_WIDTH + 5,
                animalPos.getRow() * ZOO_CELL_HEIGHT + 5,
                ZOO_CELL_WIDTH - 10,
                ZOO_CELL_HEIGHT - 10
            );
          }
        }
      }
    }
  }
}
