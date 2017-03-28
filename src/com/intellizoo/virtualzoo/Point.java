package com.intellizoo.virtualzoo;

/*
 * VirtualZoo (Java) - Tugas Besar IF2210 Pemrograman Berorientasi Objek
 * Kelompok 1 - IntelliZoo
 * - 13515001 [K-01] Jonathan Christopher
 * - 13515004 [K-01] Jordhy Fernando
 * - 13515048 [K-03] Alvin Sullivan
 * - 13515143 [K-02] Agus Gunawan
 * ***
 * Nama file         : Point.java
 * Tanggal dibuat    : 3/26/17
 * Tanggal perubahan : 3/28/17
 */

import static java.lang.Math.abs;

/**
 * Kelas point yang merepresentasikan sebuah titik.
 *
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
   *
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
   * Memeriksa apakah point berada dalam persegi panjang (0, 0) hingga (rows-1, cols-1) inklusif.
   *
   * @param rows Batas jumlah baris.
   * @param cols Batas jumlah kolom.
   * @return true jika point berada dalam batasan, false jika tidak.
   */
  public boolean inArea(int rows, int cols) {
    return row >= 0 && col >= 0 && row < rows && col < cols;
  }

  /**
   * Menambahkan (mentranslasi) current point dengan point P.
   *
   * @param P point yang ditambahkan.
   * @return point hasil penambahan dengan point P.
   */
  public Point translate(Point P) {
    return new Point(row + P.row, col + P.col);
  }

  /**
   * Mengurangi/mentranslasi dengan negatif dari current point dengan point P.
   *
   * @param P point yang dikurangkan.
   * @return point hasil pengurangan dengan point P.
   */
  public Point subtract(Point P) {
    return new Point(row - P.row, col - P.col);
  }

  /**
   * Memeriksa kesamaan point ini dengan point P.
   *
   * @param P point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point P bernilai sama.
   */
  public boolean equals(Point P) {
    return row == P.row && col == P.col;
  }

  /**
   * Mengembalikan jarak tegak lurus dari titik ini ke titik p.
   * @param p Titik yang ingin dicari jaraknya dari titik ini.
   * @return Jarak tegak lurus dari titik ini ke titik p.
   */
  public int distanceTo(Point p) {
    return abs(this.row - p.row) + abs(this.col - p.col);
  }
}