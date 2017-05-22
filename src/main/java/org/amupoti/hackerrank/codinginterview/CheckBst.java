package org.amupoti.hackerrank.codinginterview;

public class CheckBst {

  /*
  The Node class is defined as follows:
  class Node {
    int data;
    Node left;
    Node right;
  }
  */
  boolean checkBST(NodeBst root) {
    return check(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
  }
  boolean check(NodeBst n, int min, int max){
    if(n==null)
      return true;
    if(n.data <= min || n.data >= max)
      return false;
    return check(n.left, min, n.data)
        && check(n.right, n.data, max);
  }
}
