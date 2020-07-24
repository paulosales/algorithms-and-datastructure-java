package com.paulosales.algorithmsandds.ds.linkedlist;

public class DoublyLinkedList<T> {
  private DoublyLinkedListNode<T> head;
  private DoublyLinkedListNode<T> tail;
  private int size = 0;

  public void unshift(DoublyLinkedListNode<T> node) {
    if (this.head != null) {
      this.head.setPrev(node);
    }
    node.setNext(this.head);
    this.head = node;
    if (this.size == 0) {
      this.tail = node;
    }
    this.size++;
  }

  public void remove(DoublyLinkedListNode<T> node) {
    if (node == this.tail) {
      this.tail = node.getPrev();
    } else {
      node.getNext().setPrev(node.getPrev());
    }

    if (node == this.head) {
      this.head = node.getNext();
    } else {
      node.getPrev().setNext(node.getNext());
    }

    node.setPrev(null);
    node.setNext(null);
    this.size--;
  }

  public void clear() {
    this.head = null;
    this.tail = null;
    this.size = 0;
  }

  public DoublyLinkedListNode<T> getHead() {
    return head;
  }

  public DoublyLinkedListNode<T> getTail() {
    return tail;
  }

  public int getSize() {
    return size;
  }
}
