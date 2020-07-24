package com.paulosales.algorithmsandds.ds.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class DoublyLinkedListTest {

  @Test
  public void testUnshift() {
    final DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();
    Assert.assertEquals(0, dll.getSize());
    Assert.assertNull(dll.getHead());
    Assert.assertNull(dll.getTail());

    DoublyLinkedListNode<Integer> node1 = new DoublyLinkedListNode<Integer>(1);
    dll.unshift(node1);
    Assert.assertEquals(1, dll.getSize());
    Assert.assertNull(node1.getPrev());
    Assert.assertNull(node1.getNext());
    Assert.assertEquals(node1, dll.getHead());
    Assert.assertEquals(node1, dll.getTail());

    DoublyLinkedListNode<Integer> node2 = new DoublyLinkedListNode<Integer>(2);
    dll.unshift(node2);
    Assert.assertEquals(2, dll.getSize());
    Assert.assertNull(node2.getPrev());
    Assert.assertEquals(node1, node2.getNext());
    Assert.assertEquals(node2, dll.getHead());
    Assert.assertEquals(node1, dll.getTail());

    DoublyLinkedListNode<Integer> node3 = new DoublyLinkedListNode<Integer>(3);
    dll.unshift(node3);
    Assert.assertEquals(3, dll.getSize());
    Assert.assertNull(node3.getPrev());
    Assert.assertEquals(node2, node3.getNext());
    Assert.assertEquals(node3, dll.getHead());
    Assert.assertEquals(node2, dll.getHead().getNext());
    Assert.assertEquals(node1, dll.getTail());
  }

  @Test
  public void testRemoveFromTail() {
    final DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();

    DoublyLinkedListNode<Integer> node1 = new DoublyLinkedListNode<Integer>(1);
    dll.unshift(node1);
    DoublyLinkedListNode<Integer> node2 = new DoublyLinkedListNode<Integer>(2);
    dll.unshift(node2);
    DoublyLinkedListNode<Integer> node3 = new DoublyLinkedListNode<Integer>(3);
    dll.unshift(node3);

    Assert.assertEquals(3, dll.getSize());
    dll.remove(dll.getTail());
    Assert.assertEquals(2, dll.getSize());
    Assert.assertEquals(node2, dll.getTail());
    Assert.assertEquals(node2, dll.getHead().getNext());
  }

  @Test
  public void testRemoveFromHead() {
    final DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();

    DoublyLinkedListNode<Integer> node1 = new DoublyLinkedListNode<Integer>(1);
    dll.unshift(node1);
    DoublyLinkedListNode<Integer> node2 = new DoublyLinkedListNode<Integer>(2);
    dll.unshift(node2);
    DoublyLinkedListNode<Integer> node3 = new DoublyLinkedListNode<Integer>(3);
    dll.unshift(node3);

    Assert.assertEquals(3, dll.getSize());
    dll.remove(dll.getHead());
    Assert.assertEquals(2, dll.getSize());
    Assert.assertEquals(node2, dll.getHead());
    Assert.assertEquals(node2, dll.getTail().getPrev());
  }

  @Test
  public void testClear() {
    final DoublyLinkedList<Integer> dll = new DoublyLinkedList<Integer>();

    DoublyLinkedListNode<Integer> node1 = new DoublyLinkedListNode<Integer>(1);
    dll.unshift(node1);
    DoublyLinkedListNode<Integer> node2 = new DoublyLinkedListNode<Integer>(2);
    dll.unshift(node2);
    DoublyLinkedListNode<Integer> node3 = new DoublyLinkedListNode<Integer>(3);
    dll.unshift(node3);

    Assert.assertEquals(3, dll.getSize());
    dll.clear();
    Assert.assertEquals(0, dll.getSize());
    Assert.assertNull(dll.getHead());
    Assert.assertNull(dll.getTail());
  }
}
