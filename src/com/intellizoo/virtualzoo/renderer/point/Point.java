package com.intellizoo.virtualzoo.renderer.point;

/**
 * Created by Alvin on 26/03/2017.
 */

/** @class point
 * Kelas point yang merepresentasikan sebuah titik.
 */
public class Point {

  /** @brief Nilai baris (ordinat).
   */
  private int r;
  /** @brief Nilai kolom (absis).
   */
  private int c;

  /** @brief Constructor.
   * @details Menciptakan titik dengan koordinat (0, 0).
   */
  public Point() {
    r = 0;
    c = 0;
  }

  ;

  /** @brief Constructor.
   * @details Menciptakan titik dengan koordinat (r, c).
   * @param r Nilai baris (ordinat).
   * @param c Nilai kolom (absis).
   */
  public Point(int r, int c) {
    this.r = r;
    this.c = c;
  }

  ;

  /** @brief Mengambil nilai baris (ordinat).
   * @return Nilai baris (ordinat).
   */
  public int GetR() {
    return r;
  }

  ;

  /** @brief Mengambil nilai kolom (absis).
   * @return Nilai kolom (absis).
   */
  public int GetC() {
    return c;
  }

  ;

  /** @brief Set nilai baris (ordinat).
   * @param r Nilai baris (ordinat).
   */
  public void SetR(int r) {
    this.r = r;
  }

  ;

  /** @brief Set nilai kolom (absis).
   * @param c Nilai kolom (absis).
   */
  public void SetC(int c) {
    this.c = c;
  }

  ;

  /**@brief Memeriksa apakah point berada dalam persegi panjang (0, 0)
   * hingga (rows-1, cols-1) inklusif.
   * @param rows Batas jumlah baris.
   * @param cols Batas jumlah kolom.
   * @return True jika point berada dalam batasan, false jika tidak.
   */
  public boolean InArea(int rows, int cols) {
    return r >= 0 && c >= 0 && r < rows && c < cols;
  }

  ;

  /** @brief Operator+.
   * @details Menambahkan (mentranslasi) current point dengan point rhs.
   * @param p point yang ditambahkan.
   * @return point hasil penambahan dengan rhs.
   */
  public Point Add(Point p) {
    return new Point(r + p.r, c + p.c);
  }

  ;

  /** @brief Operator-.
   * @details Mengurangi/mentranslasi dengan negatif dari current point dengan
   * point rhs.
   * @param p point yang dikurangkan.
   * @return point hasil pengurangan dengan rhs.
   */
  public Point Substract(Point p) {
    return new Point(r - p.r, c - p.c);
  }

  ;

  /** @brief Operator==.
   * @details Memeriksa kesamaan point ini dengan point rhs.
   * @param p point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point rhs bernilai sama.
   */
  boolean IsEqual(Point p) {
    return r == p.r && c == p.c;
  }

  ;

  /** @brief Operator!=.
   * @details Memeriksa ketidakkesamaan point ini dengan point rhs.
   * @param p point yang akan dibandingkan dengan point ini.
   * @return Mengembalikan true jika point ini dengan point rhs tidak sama.
   */
  boolean IsNotEqual(Point p) {
    return !(p == this);
  }

  ;
};