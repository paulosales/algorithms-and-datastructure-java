package com.paulosales.algorithmsandds.ds.linkedlist;

public class DoublyLinkedListNode<T> {
  private DoublyLinkedListNode<T> prev;
  private DoublyLinkedListNode<T> next;
  private T value;

  public DoublyLinkedListNode(T value) {
    this.value = value;
  }

  public DoublyLinkedListNode<T> getPrev() {
    return prev;
  }

  public void setPrev(DoublyLinkedListNode<T> prev) {
    this.prev = prev;
  }

  public DoublyLinkedListNode<T> getNext() {
    return next;
  }

  public void setNext(DoublyLinkedListNode<T> next) {
    this.next = next;
  }

  public T getValue() {
    return value;
  }

  public void setValue(T value) {
    this.value = value;
  }
}
