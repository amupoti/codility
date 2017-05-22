package org.amupoti.hackerrank.codinginterview;

import org.junit.Assert;
import org.junit.Test;

public class LinkedListCycleTest {

  @Test
  public void hasNoCycle() throws Exception {
    Node n = new Node();
    LinkedListCycle linkedListCycle = new LinkedListCycle();
    Assert.assertFalse(linkedListCycle.hasCycle(n));
  }

  @Test
  public void hasCycle() throws Exception {
    Node n = new Node();
    n.next = n;
    LinkedListCycle linkedListCycle = new LinkedListCycle();
    Assert.assertTrue(linkedListCycle.hasCycle(n));
  }

}