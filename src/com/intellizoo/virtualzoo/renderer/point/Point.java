package com.intellizoo.virtualzoo.renderer.point;

/**
 * Created by Alvin on 26/03/2017.
 */

/**
 * @class point Kelas point yang merepresentasikan sebuah titik.
 */
public class Point {

  private int r;
  private int c;

  /**
   * @brief Constructor.
   * @details Menciptakan titik dengan koordinat (0, 0).
   */
  public Point() {
    r = 0;
    c = 0;
  }

  /**
   * @param r Nilai baris (ordinat).
   * @param c Nilai kolom (absis).
   * @brief Constructor.
   * @details Menciptakan titik dengan koordinat (r, c).
   */
  public Point(int r, int c) {
    this.r = r;
    this.c = c;
  }

  /**
   * @return Nilai baris (ordinat).
   * @brief Mengambil nilai baris (ordinat).
   */
  public int GetR() {
    return r;
  }

  /**
   * @return Nilai kolom (absis).
   * @brief Mengambil nilai kolom (absis).
   */
  public int GetC() {
    return c;
  }

  /**
   * @param r Nilai baris (ordinat).
   * @brief Set nilai baris (ordinat).
   */
  public void SetR(int r) {
    this.r = r;
  }

  /**
   * @param c Nilai kolom (absis).
   * @brief Set nilai kolom (absis).
   */
  public void SetC(int c) {
    this.c = c;
  }

  /**
   * @param rows Batas jumlah baris.
   * @param cols Batas jumlah kolom.
   * @return True jika point berada dalam batasan, false jika tidak.
   * @brief Memeriksa apakah point berada dalam persegi panjang (0, 0) hingga (rows-1, cols-1)
   * inklusif.
   */
  public boolean InArea(int rows, int cols) {
    return r >= 0 && c >= 0 && r < rows && c < cols;
  }

  /**
   * @param p point yang ditambahkan.
   * @return point hasil penambahan dengan rhs.
   * @brief Operator+.
   * @details Menambahkan (mentranslasi) current point dengan point rhs.
   */
  public Point Add(Point p) {
    return new Point(r + p.r, c + p.c);
  }

  /**
   * @param p point yang dikurangkan.
   * @return point hasil pengurangan dengan rhs.
   * @brief Operator-.
   * @details Mengurangi/mentranslasi dengan negatif dari current point dengan point rhs.
   */
  public Point Substract(Point p) {
    return new Point(r - p.r, c - p.c);
  }

  /**
   * @param p point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point rhs bernilai sama.
   * @brief Operator==.
   * @details Memeriksa kesamaan point ini dengan point rhs.
   */
  boolean IsEqual(Point p) {
    return r == p.r && c == p.c;
  }

  /**
   * @param p point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point rhs tidak sama.
   * @brief Operator!=.
   * @details Memeriksa ketidakkesamaan point ini dengan point rhs.
   */
  boolean IsNotEqual(Point p) {
    return !(p == this);
  }
};