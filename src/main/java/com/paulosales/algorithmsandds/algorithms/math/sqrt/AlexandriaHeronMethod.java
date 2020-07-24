/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.algorithms.math.sqrt;

public class AlexandriaHeronMethod {
  public static double sqrt(double number) {
    return sqrt(number, 0.00001);
  }

  public static double sqrt(double number, double precision) {
    double guess = number / 2.0;

    while (Math.abs(number - guess * guess) > precision) {
      guess = (guess + number / guess) / 2.0;
    }

    return guess;
  }
}
