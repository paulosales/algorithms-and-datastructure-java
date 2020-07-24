/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.ds.tree.serializer;

import com.paulosales.algorithmsandds.ds.tree.BinaryTree;
import java.util.LinkedList;
import java.util.Queue;

public class BinaryTreeIndentedSerializer<T> implements BinaryTreeSerializer {

  class LeveledNode {
    int level = 0;
    BinaryTree<T> tree;

    public LeveledNode(BinaryTree<T> tree, int level) {
      this.tree = tree;
      this.level = level;
    }
  }

  private BinaryTree<T> root;

  public BinaryTreeIndentedSerializer(BinaryTree<T> root) {
    this.root = root;
  }

  /** A implementation of Bread-first search algorithm to print the tree indented by level. */
  @Override
  public String toString() {
    Queue<LeveledNode> queue = new LinkedList<LeveledNode>();
    queue.add(new LeveledNode(this.root, 0));

    StringBuffer sb = new StringBuffer();
    LeveledNode node = null;
    while (!queue.isEmpty()) {
      node = queue.poll();
      for (int i = 0; i < node.level; i++) {
        sb.append(" ");
      }
      sb.append(node.tree.getValue().toString()).append(System.lineSeparator());

      if (node.tree.getLeft() != null) {
        queue.add(new LeveledNode(node.tree.getLeft(), node.level + 2));
      }
      if (node.tree.getRight() != null) {
        queue.add(new LeveledNode(node.tree.getRight(), node.level + 2));
      }
    }

    return sb.toString();
  }
}
