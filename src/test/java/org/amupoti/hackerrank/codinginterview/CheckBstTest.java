package org.amupoti.hackerrank.codinginterview;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class CheckBstTest {

  @Test
  public void testSimpleBst() {
    CheckBst cb = new CheckBst();
    NodeBst n = new NodeBst(null, 0, null);
    assertTrue(cb.checkBST(n));
  }

  @Test
  public void testSimpleLeafNotBst() {
    CheckBst cb = new CheckBst();
    NodeBst leaf = new NodeBst(null, 0, null);
    NodeBst n = new NodeBst(leaf, 0, leaf);
    assertFalse(cb.checkBST(n));
  }

  @Test
  public void testSimpleBstWithTwoLeafs() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(new NodeBst(null, -20, null), -10, null);
    NodeBst r = new NodeBst(null, 10, null);
    NodeBst n = new NodeBst(l, 0, r);
    assertTrue(cb.checkBST(n));
  }

  @Test
  public void testSimpleBstWithTwoLeafsNoBst() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(new NodeBst(null, 20, null), -10, null);
    NodeBst r = new NodeBst(null, 10, null);
    NodeBst n = new NodeBst(l, 0, r);
    assertFalse(cb.checkBST(n));
  }

  @Test
  public void testSimpleBstWithEqualValue() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(null, -10, new NodeBst(null, -10, null));
    NodeBst r = new NodeBst(null, 10, null);
    NodeBst n = new NodeBst(l, 0, r);
    assertFalse(cb.checkBST(n));
  }

  @Test
  public void testSimpleBstWithEqualValueInSameLevel() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(null, 2, new NodeBst(null, 3, null));
    NodeBst r = new NodeBst(null, 2, null);
    NodeBst n = new NodeBst(l, 1, r);
    assertFalse(cb.checkBST(n));
  }
  @Test
  public void testBst() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(null, -2, new NodeBst(null, -1, null));
    NodeBst r = new NodeBst(null, 2, null);
    NodeBst n = new NodeBst(l, 1, r);
    assertTrue(cb.checkBST(n));
  }

  @Test
  public void testBstSameValues() {
    CheckBst cb = new CheckBst();
    NodeBst l = new NodeBst(new NodeBst(null, 1, null), 2, new NodeBst(null, 2, null));
    NodeBst r = new NodeBst(new NodeBst(null, 5, null), 6, new NodeBst(null, 7, null));
    NodeBst n = new NodeBst(l, 4, r);
    assertFalse(cb.checkBST(n));
  }
}