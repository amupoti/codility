package org.amupoti.hackerrank.codinginterview;

public class NodeBst {

  int data;
  NodeBst left;
  NodeBst right;

  public NodeBst(NodeBst left, int data, NodeBst right) {
    this.right = right;
    this.data = data;
    this.left = left;
  }
}
