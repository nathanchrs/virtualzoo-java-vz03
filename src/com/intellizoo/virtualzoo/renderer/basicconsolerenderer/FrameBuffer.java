package com.intellizoo.virtualzoo.renderer.basicconsolerenderer;

import com.intellizoo.virtualzoo.point.Point;

// Nama file         : FrameBuffer.java
// Tanggal dibuat    : 27/03/2017
// Tanggal perubahan : 27/03/2017

/**
 * Kelas FrameBuffer yang berfungsi untuk mengatur tampilan pada layar.
 *
 * @author Jonathan Christopher
 */
public class FrameBuffer {

  /**
   * Jenis warna yang tersedia.
   */
  public enum Color {
    TRANSPARENT,
    BLACK, MAROON, GREEN, BROWN, DARK_BLUE, PURPLE, TEAL, WHITE,
    GRAY, RED, LIME, YELLOW, BLUE, PINK, CYAN, LIGHT_GRAY
  }

  public static final char BLANK = ' ';
  public static final String CS_INITIATOR = "\033[";
  public static final String CS_TERMINATOR = "m";
  public static final String RESET = "0";
  public static final String [] FG_COLOR_CONSTANTS = {
      "", // unused (transparent)
      "30", "31", "32", "33", "34", "35", "36", "37",
      "1;30", "1;31", "1;32", "1;33", "1;34", "1;35", "1;36", "1;37"
  };
  public static final String [] BG_COLOR_CONSTANTS = {
      "", // unused (transparent)
      "40", "41", "42", "43", "44", "45", "46", "47",
      // background colors only support the faint 8 colors
      "40", "41", "42", "43", "44", "45", "46", "47"
  };

  private int rows;
  private int cols;
  private boolean colored;
  private char [] contents;
  private Color [] fgColors;
  private Color [] bgColors;
  private String inputPrompt;

  /**
   * Menciptakan FrameBuffer dengan ukuran rows x cols dengan status warna colored.
   *
   * @param rows Nilai ukuran baris.
   * @param cols Nilai ukuran kolom.
   * @param colored Status warna FrameBuffer.
   */
  public FrameBuffer(int rows, int cols, boolean colored) {
    this.rows = rows;
    this.cols = cols;
    this.colored = colored;
    contents = new char[rows * cols];
    fgColors = new Color[rows * cols];
    bgColors = new Color[rows * cols];
    inputPrompt = "";
    clear();
  }

  public int getRows() {
    return rows;
  }

  public int getCols() {
    return cols;
  }

  public boolean isColored() {
    return colored;
  }

  public void setColored(boolean colored) {
    this.colored = colored;
  }

  public String getInputPrompt() {
    return inputPrompt;
  }

  public void setInputPrompt(String inputPrompt) {
    this.inputPrompt = inputPrompt;
  }

  /**
   * Mengosongkan isi layar dari FrameBuffer.
   */
  public void clear() {
    for (int i = 0; i < rows * cols; i++) {
      contents[i] = BLANK;
      fgColors[i] = Color.TRANSPARENT;
      bgColors[i] = Color.TRANSPARENT;
    }
  }

  /**
   * Menggambar sebuah karakter pada posisi tertentu di FrameBuffer dengan warna tulisan dan latar
   * yang ditentukan.
   *
   * @param p Posisi tempat karacter akan digambar.
   * @param content Karakter yang akan digambar.
   * @param fgColor Warna karakter (foreground) yang akan digambar.
   * @param bgColor Warna latar (background) dari karakter yang akan digambar.
   */
  public void drawPoint(Point p, char content, Color fgColor, Color bgColor) {
    if (p.inArea(rows, cols)) {
      contents[idx(p)] = content;
      if (fgColor != Color.TRANSPARENT) {
        fgColors[idx(p)] = bgColor;
      }
      if (bgColor != Color.TRANSPARENT) {
        bgColors[idx(p)] = bgColor;
      }
    }
  }

  /**
   * Menggambar sebuah garis horizontal pada posisi yang ditentukan dengan warna tulisan dan latar
   * yang ditentukan.
   *
   * @param p1 Posisi awal garis yang akan digambar.
   * @param p2 Posisi akhir garis yang akan digambar.
   * @param content Karakter yang merepresentasikan garis yang akan digambar.
   * @param fgColor Warna tulisan (foreground) dari garis yang akan digambar.
   * @param bgColor Warna latar (background) dari garis yang akan digambar.
   */
  public void drawHorizontalLine(Point p1, Point p2, char content, Color fgColor, Color bgColor) {
    int i1 = p1.getCol() < p2.getCol() ? p1.getCol() : p2.getCol();
    int i2 = p1.getCol() < p2.getCol() ? p2.getCol() : p1.getCol();
    for (int i = i1; i <= i2; i++) {
      drawPoint(new Point(p1.getRow(), i), content, fgColor, bgColor);
    }
  }

  /**
   * Menggambar sebuah garis vertikal pada posisi yang ditentukan dengan warna tulisan dan latar
   * yang ditentukan.
   *
   * @param p1 Posisi awal garis yang akan digambar.
   * @param p2 Posisi akhir garis yang akan digambar.
   * @param content Karakter yang merepresentasikan garis yang akan digambar.
   * @param fgColor Warna tulisan (foreground) dari garis yang akan digambar.
   * @param bgColor Warna latar (background) dari garis yang akan digambar.
   */
  public void drawVerticalLine(Point p1, Point p2, char content, Color fgColor, Color bgColor) {
    int i1 = p1.getRow() < p2.getRow() ? p1.getRow() : p2.getRow();
    int i2 = p1.getRow() < p2.getRow() ? p2.getRow() : p1.getRow();
    for (int i = i1; i <= i2; i++) {
      drawPoint(new Point(i, p1.getCol()), content, fgColor, bgColor);
    }
  }

  /**
   * Menggambar sebuah text box di FrameBuffer pada posisi kiri atas dan kanan bawah yang ditentukan
   * dengan warna tulisan dan latar yang ditentukan.
   *
   * @param topLeft Posisi kiri atas dari text box yang akan digambar.
   * @param bottomRight Posisi kanan bawah dari text box yang akan digambar.
   * @param str Isi dari text box yang akan digambar.
   * @param fgColor Warna tulisan/foreground dari text box yang akan digambar.
   * @param bgColor Warna latar (background) dari text box yang akan digambar.
   */
  public void drawTextBox(Point topLeft, Point bottomRight, String str, Color fgColor,
      Color bgColor) {
    if (str.length() > 0) {
      int it = 0;
      boolean done = false;
      for (int row = topLeft.getRow(); row <= bottomRight.getRow() && !done; row++) {
        for (int col = topLeft.getCol(); col <= bottomRight.getCol() && !done; col++) {
          if (str.charAt(it) == '\n') {
            it++;
            if (it >= str.length()) {
              done = true;
            }
            break;
          }
          Point p = new Point(row, col);
          if (p.inArea(rows, cols)) {
            contents[idx(p)] = str.charAt(it);
            if (fgColor != Color.TRANSPARENT) {
              fgColors[idx(p)] = fgColor;
            }
            if (bgColor != Color.TRANSPARENT) {
              bgColors[idx(p)] = bgColor;
            }
          }
          it++;
          if (it >= str.length()) {
            done = true;
          }
        }
      }
    }
  }

  /**
   * Menggambar sebuah persegi panjang di FrameBuffer pada posisi kiri atas dan kanan bawah yang
   * ditentukan dengan warna tulisan dan latar yang ditentukan.
   *
   * @param topLeft Posisi kiri atas dari text box yang akan digambar.
   * @param bottomRight Posisi kanan bawah dari text box yang akan digambar.
   * @param borderCharacter Karakter yang merepresentasikan garis pembatas persegi panjang yang akan
   digambar.
   * @param textColor Warna dari text di persegi panjang yang akan digambar.
   * @param bgColor Warna latar dari persegi panjang yang akan digambar.
   * @param borderColor Warna garis pembatas persegi panjang yang digambar.
   */
  public void drawRectangle(Point topLeft, Point bottomRight, char borderCharacter,
      Color textColor, Color bgColor, Color borderColor) {
    for (int row = topLeft.getRow(); row <= bottomRight.getRow(); row++) {
      for (int col = topLeft.getCol(); col <= bottomRight.getCol(); col++) {
        Point p = new Point(row, col);
        if (p.inArea(rows, cols)) {
          if (row == topLeft.getRow() || row == bottomRight.getRow()
              || col == topLeft.getCol() || col == bottomRight.getCol()) {
            contents[idx(p)] = borderCharacter;
            if (textColor != Color.TRANSPARENT) {
              fgColors[idx(p)] = textColor;
            }
            if (borderColor != Color.TRANSPARENT) {
              bgColors[idx(p)] = borderColor;
            }
          } else {
            if (bgColor != Color.TRANSPARENT) {
              contents[idx(p)] = BLANK;
              bgColors[idx(p)] = bgColor;
            }
          }
        }
      }
    }
  }

  /**
   * Mengubah FrameBuffer ke dalam bentuk string untuk dicetak ke layar.
   *
   * @return string yang merepresentasikan FrameBuffer.
   */
  public String toString() {
    StringBuilder outputBuffer = new StringBuilder();
    for (int row = 0; row < rows; row++) {
      for (int col = 0; col < cols; col++) {
        Point p = new Point(row, col);
        // Output color-specifying control characters
        if (colored) {
          outputBuffer.append(CS_INITIATOR + RESET);
          if (fgColors[idx(p)] != Color.TRANSPARENT) {
            Color color = fgColors[idx(p)];
            outputBuffer.append(FG_COLOR_CONSTANTS[color.ordinal()]).append(";");
          }
          if (bgColors[idx(p)] != Color.TRANSPARENT) {
            Color color = bgColors[idx(p)];
            outputBuffer.append(BG_COLOR_CONSTANTS[color.ordinal()]);
          }
          outputBuffer.append(CS_TERMINATOR);
        }
        // Output actual character to be printed
        outputBuffer.append(contents[idx(p)]);
        // Output reset control characters
        if (colored) {
          outputBuffer.append(CS_INITIATOR).append(RESET).append(";").append(CS_TERMINATOR);
        }
      }
      // Output newline
      outputBuffer.append('\n');
    }

    // Add input prompt text at the bottom of the screen
    outputBuffer.append(inputPrompt);

    // Print the output buffer's contents to the output stream
    return outputBuffer.toString();
  }

  /**
   * Mengembalikan indeks FrameBuffer pada baris dan kolom yang ditentukan.
   *
   * @param row Nilai baris.
   * @param col Nilai kolom.
   * @return Nilai indeks di FrameBuffer.
   */
  private int idx(int row, int col) {
    return row * cols + col;
  }

  /**
   * Mengembalikan indeks di FrameBuffer pada posisi yang ditentukan.
   *
   * @param p Nilai titik.
   * @return Nilai indeks di FrameBuffer.
   */
  private int idx(Point p) {
    return p.getRow() * cols + p.getCol();
  }
}
