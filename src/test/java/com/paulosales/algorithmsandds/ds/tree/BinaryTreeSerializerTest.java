/**
 * Copyright (c) 2019-present, Paulo Rogério Sales Santos - <paulosales@gmail.com>
 *
 * <p>This source code is licensed under the MIT license found in then LICENSE file in the root
 * directory of this source tree.
 */
package com.paulosales.algorithmsandds.ds.tree;

import com.paulosales.algorithmsandds.ds.tree.serializer.BinaryTreeIndentedSerializer;
import com.paulosales.algorithmsandds.ds.tree.serializer.BinaryTreeSerializer;
import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeSerializerTest {
  @Test
  public void testIndentSerialization() {
    BinaryTree<String> binaryTree =
        BinaryTreeBuilder.<String>oneBinaryTree()
            .withValue("Root")
            .withLeft(
                BinaryTreeBuilder.oneBinaryTree()
                    .withValue("ID 1 - Level 1")
                    .withLeft(BinaryTreeBuilder.oneBinaryTree().withValue("ID 3 - Level 2").build())
                    .build())
            .withRight(BinaryTreeBuilder.oneBinaryTree().withValue("ID 2 - Level 1").build())
            .build();

    BinaryTreeSerializer serializer = new BinaryTreeIndentedSerializer<String>(binaryTree);

    Assert.assertEquals(
        String.format("Root%n  ID 1 - Level 1%n  ID 2 - Level 1%n    ID 3 - Level 2%n"),
        serializer.toString());
  }
}
