/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.ds.tree;

import java.util.List;
import org.junit.Assert;
import org.junit.Test;

public class BreadthFirstSearchTest {

  @Test
  public void testSearch() {
    BinaryTree<Integer> binaryTree =
        BinaryTreeBuilder.oneBinaryTree()
            .withValue(1)
            .withLeft(
                BinaryTreeBuilder.oneBinaryTree()
                    .withValue(2)
                    .withLeft(BinaryTreeBuilder.oneBinaryTree().withValue(4).build())
                    .build())
            .withRight(BinaryTreeBuilder.oneBinaryTree().withValue(3).build())
            .build();

    BreadthFirstSearch bfs = new BreadthFirstSearch();

    List<Integer> visitedNodes = bfs.search(binaryTree);

    Assert.assertEquals("[1, 2, 3, 4]", visitedNodes.toString());
  }
}
