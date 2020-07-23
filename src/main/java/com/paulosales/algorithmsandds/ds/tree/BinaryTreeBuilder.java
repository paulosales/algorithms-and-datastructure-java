/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * This source code is licensed under the MIT license found in then
 * LICENSE file in the root directory of this source tree.
 */

package com.paulosales.algorithmsandds.ds.tree;

public class BinaryTreeBuilder<T> {
  private BinaryTree<T> binaryTree;

  private BinaryTreeBuilder() {
    binaryTree = new BinaryTree<T>();
  }

  public static <T> BinaryTreeBuilder oneBinaryTree() {
    return new BinaryTreeBuilder<T>();
  }

  public BinaryTreeBuilder<T> withValue(T value) {
    this.binaryTree.setValue(value);
    return this;
  }

  public BinaryTreeBuilder<T> withLeft(BinaryTree<T> left) {
    this.binaryTree.setLeft(left);
    return this;
  }

  public BinaryTreeBuilder<T> withRight(BinaryTree<T> right) {
    this.binaryTree.setRight(right);
    return this;
  }

  public BinaryTree<T> build() {
    return binaryTree;
  }
}
