package com.paulosales.algorithmsandds.algorithms.cache;

import org.junit.Assert;
import org.junit.Test;

public class LRUCacheTest {
  @Test
  public void testInsert7ElementsInACacheOfCapacity5() {
    Cache<String, String> cache = new LRUCache<>(5);
    Assert.assertEquals(5, cache.getCapacity());

    cache.set("user1", "Paulo");
    cache.set("user2", "Kellina");
    cache.set("user3", "Lara");
    cache.set("user4", "Livia");
    cache.set("user5", "Kelliana");
    Assert.assertEquals(5, cache.getSize());

    cache.set("user6", "Zilmar");
    Assert.assertNull(cache.get("user1"));
    Assert.assertEquals(5, cache.getSize());
    cache.set("user7", "Genésio");
    Assert.assertNull(cache.get("user2"));
  }

  @Test
  public void testHitTheLeatRecentlyItem() {
    Cache<String, String> cache = new LRUCache<>(5);
    Assert.assertEquals(5, cache.getCapacity());

    cache.set("user1", "Paulo");
    cache.set("user2", "Kellina");
    cache.set("user3", "Lara");
    cache.set("user4", "Livia");
    cache.set("user5", "Kelliana");
    Assert.assertEquals(5, cache.getSize());

    Assert.assertEquals("Paulo", cache.get("user1"));
    cache.set("user6", "Zilmar");
    Assert.assertNull(cache.get("user2"));
  }

  @Test
  public void testClear() {
    Cache<String, String> cache = new LRUCache<>(5);
    Assert.assertEquals(5, cache.getCapacity());

    cache.set("user1", "Paulo");
    cache.set("user2", "Kellina");
    cache.set("user3", "Lara");
    cache.set("user4", "Livia");
    cache.set("user5", "Kelliana");
    Assert.assertEquals(5, cache.getSize());

    cache.clear();
    Assert.assertEquals(0, cache.getSize());
  }
}
