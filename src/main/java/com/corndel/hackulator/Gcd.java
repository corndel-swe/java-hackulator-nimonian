package com.corndel.hackulator;

public class Gcd {

  /**
   * Works out the greatest common divisor of two numbers Uses the euclidean
   * algorithm:
   * https://www.youtube.com/watch?v=JUzYl1TYMcU
   *
   * <p>
   * gcd(8, 12) => 4
   */
  static int gcd(int a, int b) {
    var big = Math.max(a, b);
    var small = Math.min(a, b);

    while (small != 0) {
      var r = big % small;
      big = small;
      small = r;
    }

    return big;
  }
}
