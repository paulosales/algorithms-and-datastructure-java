/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.algorithms.math.sqrt;

import java.util.Locale;
import org.junit.Assert;
import org.junit.Test;

public class AlexandriaHeronMethodTest {

  @Test
  public void testSqrt() {
    final String fmt = "%.3f";

    Locale.setDefault(Locale.ENGLISH);

    Assert.assertEquals("2.000", String.format(fmt, AlexandriaHeronMethod.sqrt(4)));
    Assert.assertEquals("4.000", String.format(fmt, AlexandriaHeronMethod.sqrt(16)));
    Assert.assertEquals("3.162", String.format(fmt, AlexandriaHeronMethod.sqrt(10)));
  }
}
