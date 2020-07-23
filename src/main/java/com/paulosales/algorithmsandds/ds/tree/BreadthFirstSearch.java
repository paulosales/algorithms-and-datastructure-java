/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * This source code is licensed under the MIT license found in then
 * LICENSE file in the root directory of this source tree.
 */

package com.paulosales.algorithmsandds.ds.tree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/** Implementation of the Breadth-first search algorithm. */
public class BreadthFirstSearch<T> {

  public List<String> search(BinaryTree<T> binaryTree) {
    List<String> visitedNodes = new ArrayList<String>();

    if (binaryTree != null) {
      Queue<BinaryTree<T>> queue = new LinkedList<BinaryTree<T>>();
      queue.add(binaryTree);

      while (!queue.isEmpty()) {
        BinaryTree<T> node = queue.poll();
        visitedNodes.add(node.getValue().toString());
        if (node.getLeft() != null) {
          queue.add(node.getLeft());
        }
        if (node.getRight() != null) {
          queue.add(node.getRight());
        }
      }
    }

    return visitedNodes;
  }
}
