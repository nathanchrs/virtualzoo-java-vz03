package com.intellizoo.virtualzoo.renderer.basicconsolerenderer;
import com.intellizoo.virtualzoo.renderer.Renderer;
import com.intellizoo.virtualzoo.renderer.framebuffer.FrameBuffer;
import com.intellizoo.virtualzoo.renderer.point.Point;
import com.intellizoo.virtualzoo.zoo.Zoo;
import com.intellizoo.virtualzoo.zoo.animal.Animal;
import com.intellizoo.virtualzoo.zoo.cell.Cell;
import com.intellizoo.virtualzoo.zoo.zone.Zone;
import com.intellizoo.virtualzoo.zoo.zone.cage.Cage;
import java.util.Vector;

// Nama file         : BasicConsoleRenderer.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas BasicConsoleRenderer yang berfungsi untuk menggambar objek di atas console teks.
 * @author Jordhy Fernando
 */
public class BasicConsoleRenderer implements Renderer {
  private int getMax(int a, int b) {
    return a > b ? a : b;
  }

  private int getMin(int a, int b) {
    return a < b ? a : b;
  }

  /**
   * Menggambar sebuah kebun binatang.
   * @param zoo Kebun binatang yang akan digambarkan.
   * @param topLeft Batas kiri atas peta yang akan digambar (r1, c1).
   * @param bottomRight Batas kanan bawah peta yang akan digambar (r2, c2).
   * @param useColor Jika true, output tampilan berwarna.
   */
  public void render(Zoo zoo, Point topLeft, Point bottomRight, boolean useColor) {
    topLeft = new Point(getMax(topLeft.getRow(), 0), getMax(topLeft.getCol(), 0));
    bottomRight = new Point(getMin(bottomRight.getRow(), zoo.getRows() - 1),
      getMin(bottomRight.getCol(), zoo.getCols() - 1));

    final Point GRID_OFFSET = new Point(3, 3);
    final int ROWS = bottomRight.getRow() - topLeft.getRow() + 1;
    final int COLS = bottomRight.getCol() - topLeft.getCol() + 1;

    Vector<Cell> cells = zoo.getCells();
    Vector<Zone> zones = zoo.getZones();
    FrameBuffer fb = new FrameBuffer(ROWS + 5, COLS + GRID_OFFSET.getCol() * 2 + 24, useColor);
    fb.clear();

    // Draw title
    fb.drawTextBox(new Point(1, 3), new Point(1, 19), ":: Virtual Zoo ::",
      FrameBuffer.Color.BLACK, FrameBuffer.Color.WHITE);

    // Draw legend
    Point legendOffset = new Point(0, COLS + 3).add(GRID_OFFSET);
    fb.drawRectangle(legendOffset, new Point(8, 20).add(legendOffset), '*',
      FrameBuffer.Color.WHITE, FrameBuffer.Color.BLACK, FrameBuffer.Color.BLACK);
    fb.drawTextBox(legendOffset.add(new Point(0, 2)), legendOffset.add(new Point(0, 7)),
      "Legend", FrameBuffer.Color.BLACK, FrameBuffer.Color.WHITE);

    fb.drawTextBox(legendOffset.add(new Point(1, 2)), legendOffset.add(new Point(1, 18)),
      ". Road", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(2, 2)), legendOffset.add(new Point(2, 18)),
      "A Air Habitat", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(3, 2)), legendOffset.add(new Point(3, 18)),
      "L Land Habitat", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(4, 2)), legendOffset.add(new Point(4, 18)),
      "W Water Habitat", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(5, 2)), legendOffset.add(new Point(5, 18)),
      "r Restaurant", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(6, 2)), legendOffset.add(new Point(6, 18)),
      "p Park", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(legendOffset.add(new Point(7, 2)), legendOffset.add(new Point(7, 18)),
      "x Animal", FrameBuffer.Color.GRAY, FrameBuffer.Color.TRANSPARENT);

    // Draw all cells
    for(int row = 0; row < ROWS; row++) {
      for(int col = 0; col < COLS; col++) {
        Point drawCell = new Point(row, col).add(topLeft);
        fb.drawPoint(new Point(row, col).add(GRID_OFFSET),
          cells.get(drawCell.getRow() * zoo.getCols() + drawCell.getCol()).render(),
          FrameBuffer.Color.WHITE, FrameBuffer.Color.TRANSPARENT);
      }
    }

    for(Zone cage : zones) {
      if (cage instanceof Cage) {
        // Redraw cells that are inside a cage
        Vector<Cell> cageCells = cage.getCells();
        for(Cell cell : cageCells) {
          Point cageCellsPos = cell.getPosition();
          if(cageCellsPos.getRow() >= topLeft.getRow()
            && cageCellsPos.getCol() >= topLeft.getCol()
            && cageCellsPos.getRow() <= bottomRight.getRow()
            && cageCellsPos.getCol() <= bottomRight.getCol()) {
            fb.drawPoint(cageCellsPos.substract(topLeft).add(GRID_OFFSET), Character.toUpperCase(cell.render()),
              FrameBuffer.Color.WHITE, FrameBuffer.Color.BLACK);
          }
        }

        // Draw animals
        Vector<Animal> animals = cage.getAnimals();
        for (Animal animal: animals) {
          Point animalPos = animal.getPosition();
          if (animalPos.getRow() >= topLeft.getRow()
            && animalPos.getCol() >= topLeft.getCol()
            && animalPos.getRow() <= bottomRight.getRow()
            && animalPos.getCol() <= bottomRight.getCol()) {
            fb.drawPoint(animalPos.substract(topLeft).add(GRID_OFFSET),
              animal.render(), FrameBuffer.Color.YELLOW,
              FrameBuffer.Color.BLACK);
          }
        }
      }
    }

    fb.setInputPrompt("Input [back] to return to menu: ");
    //fb.ClearScreen();
    System.out.print(fb);
  }

  /**
   * Menampilkan menu utama.
   * @param useColor Jika true, output tampilan berwarna.
   */
  public void displayMenu(boolean useColor) {
    FrameBuffer fb = new FrameBuffer(20, 72, useColor);
    fb.clear();

  final String titleText =
      "__      __ _        _                  _   ______             \n" +
    "\\ \\    / /(_)      | |                | | |___  /             \n" +
    " \\ \\  / /  _  _ __ | |_  _   _   __ _ | |    / /  ___    ___  \n" +
    "  \\ \\/ /  | || '__|| __|| | | | / _` || |   / /  / _ \\  / _ \\ \n" +
    "   \\  /   | || |   | |_ | |_| || (_| || |  / /__| (_) || (_) |\n" +
    "    \\/    |_||_|    \\__| \\__,_| \\__,_||_| /_____|\\___/  \\___/ \n";

  final String menuText =
    "    1. Display zoo\n" +
    "    2. Tour zoo\n" +
    "    3. Display food statistics\n" +
    "    4. Exit\n";

    fb.drawTextBox(new Point(3, 3), new Point(8, 66), titleText, FrameBuffer.Color.RED,
      FrameBuffer.Color.TRANSPARENT);
    fb.drawTextBox(new Point(11, 3), new Point(14, 66), menuText,
      FrameBuffer.Color.LIGHT_GRAY, FrameBuffer.Color.TRANSPARENT);

    fb.setInputPrompt("Select menu option [1|2|3|4]: ");
    //fb.ClearScreen();
    System.out.print(fb);
  }
}