package com.intellizoo.virtualzoo.renderer.point;

// Nama file         : Point.java
// Tanggal dibuat    : 26/03/2017
// Tanggal perubahan : 26/03/2017

/**
 * Kelas point yang merepresentasikan sebuah titik.
 * @author Alvin Sullivan
 */
public class Point {
  private int row;
  private int col;

  /**
   * Menciptakan titik dengan koordinat (0, 0).
   */
  public Point() {
    row = 0;
    col = 0;
  }

  /**
   * Menciptakan titik dengan koordinat (row, col).
   * @param row Nilai baris (ordinat).
   * @param col Nilai kolom (absis).
   */
  public Point(int row, int col) {
    this.row = row;
    this.col = col;
  }

  //Getter & Setter
  public int getRow() {
    return row;
  }

  public int getCol() {
    return col;
  }

  public void setRow(int row) {
    this.row = row;
  }

  public void setCol(int col) {
    this.col = col;
  }

  /**
   * Memeriksa apakah point berada dalam persegi panjang (0, 0) hingga (rows-1, cols-1)
   * inklusif.
   * @param rows Batas jumlah baris.
   * @param cols Batas jumlah kolom.
   * @return true jika point berada dalam batasan, false jika tidak.
   */
  public boolean inArea(int rows, int cols) {
    return row >= 0 && col >= 0 && row < rows && col < cols;
  }

  /**
   * Menambahkan (mentranslasi) current point dengan point P.
   * @param P point yang ditambahkan.
   * @return point hasil penambahan dengan point P.
   */
  public Point add(Point P) {
    return new Point(row + P.row, col + P.col);
  }

  /**
   * Mengurangi/mentranslasi dengan negatif dari current point dengan point P.
   * @param P point yang dikurangkan.
   * @return point hasil pengurangan dengan point P.
   */
  public Point substract(Point P) {
    return new Point(row - P.row, col - P.col);
  }

  /**
   * Memeriksa kesamaan point ini dengan point P.
   * @param P point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point P bernilai sama.
   */
  public boolean equals(Point P) {
    return row == P.row && col == P.col;
  }

  /**
   * Memeriksa ketidaksamaan point ini dengan point P.
   * @param P point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point P tidak sama.
   */
  public boolean notEquals(Point P) {
    return !(this.equals(P));
  }
}