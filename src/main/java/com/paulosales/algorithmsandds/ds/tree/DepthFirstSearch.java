/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.ds.tree;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/** Implementation of depth-first search algorithm. */
public class DepthFirstSearch<T> {
  public List<T> search(BinaryTree<T> binaryTree) {
    List<T> visitedNodes = new ArrayList<T>();

    Stack<BinaryTree<T>> stack = new Stack<BinaryTree<T>>();

    BinaryTree<T> node = null;

    if (binaryTree != null) {
      stack.push(binaryTree);
    }

    while (!stack.isEmpty()) {
      node = stack.pop();

      visitedNodes.add(node.getValue());

      if (node.getRight() != null) {
        stack.push(node.getRight());
      }

      if (node.getLeft() != null) {
        stack.push(node.getLeft());
      }
    }

    return visitedNodes;
  }
}
