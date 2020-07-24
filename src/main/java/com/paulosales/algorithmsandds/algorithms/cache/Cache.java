package com.paulosales.algorithmsandds.algorithms.cache;

public interface Cache<K, V> {
  public V get(K key);

  public void set(K key, V value);

  public void clear();

  public int getCapacity();

  public int getSize();
}
