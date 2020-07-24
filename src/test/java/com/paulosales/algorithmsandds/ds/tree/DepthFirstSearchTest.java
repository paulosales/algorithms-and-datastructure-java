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

public class DepthFirstSearchTest {

  @Test
  public void testSearch() {
    DepthFirstSearch dfs = new DepthFirstSearch();

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

    List<Integer> visitedNodes = dfs.search(binaryTree);

    Assert.assertEquals("[1, 2, 4, 3]", visitedNodes.toString());
  }
}
