package com.corndel.hackulator;

public class MaxOfThree {

  static int maxOfThree(int x, int y, int z) {
    if (x >= y && x >= z) {
      return x;
    }

    if (y >= z && y >= x) {
      return y;
    }

    return z;
  }
}
