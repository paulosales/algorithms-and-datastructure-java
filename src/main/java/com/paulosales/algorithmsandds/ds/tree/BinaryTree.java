/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.ds.tree;

import lombok.Data;

@Data
public class BinaryTree<T> {

  private T value;
  private BinaryTree<T> left;
  private BinaryTree<T> right;
}
