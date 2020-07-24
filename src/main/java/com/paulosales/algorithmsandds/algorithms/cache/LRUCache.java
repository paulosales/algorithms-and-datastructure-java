package com.paulosales.algorithmsandds.algorithms.cache;

import com.paulosales.algorithmsandds.ds.linkedlist.DoublyLinkedList;
import com.paulosales.algorithmsandds.ds.linkedlist.DoublyLinkedListNode;
import java.util.HashMap;
import java.util.Map;
import lombok.Data;

public class LRUCache<K, V> implements Cache<K, V> {
  @Data
  private class CacheItem<K, V> {
    public CacheItem(K key, V value) {
      this.key = key;
      this.value = value;
    }

    private K key;
    private V value;
  }

  private Map<K, DoublyLinkedListNode<CacheItem<K, V>>> hashMap;
  private DoublyLinkedList<CacheItem<K, V>> linkedList;

  private int capacity;

  private static final int DEFAULT_CAPACITY = 1024;

  public LRUCache() {
    this(DEFAULT_CAPACITY);
  }

  public LRUCache(int capacity) {
    this.capacity = capacity;
    hashMap = new HashMap<>(capacity);
    linkedList = new DoublyLinkedList<>();
  }

  private void hit(DoublyLinkedListNode<CacheItem<K, V>> node) {
    if (node != this.linkedList.getHead()) {
      linkedList.remove(node);
      linkedList.unshift(node);
    }
  }

  private void evict() {
    DoublyLinkedListNode<CacheItem<K, V>> evictedNode = linkedList.getTail();
    if (evictedNode != null) {
      linkedList.remove(evictedNode);
      hashMap.remove(evictedNode.getValue().key);
    }
  }

  public V get(K key) {
    DoublyLinkedListNode<CacheItem<K, V>> node = hashMap.get(key);
    if (node != null) {
      hit(node);
      return node.getValue().value;
    }
    return null;
  }

  public void set(K key, V value) {
    DoublyLinkedListNode<CacheItem<K, V>> node = hashMap.get(key);
    if (node == null) {
      if (linkedList.getSize() == capacity) {
        evict();
      }
      node = new DoublyLinkedListNode<>(new CacheItem<>(key, value));
      linkedList.unshift(node);
      hashMap.put(key, node);
    } else {
      hit(node);
    }
    node.getValue().setValue(value);
  }

  public void clear() {
    linkedList.clear();
    hashMap.clear();
  }

  public int getCapacity() {
    return capacity;
  }

  public int getSize() {
    return linkedList.getSize();
  }
}
