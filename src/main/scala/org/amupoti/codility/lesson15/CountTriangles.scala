package org.amupoti.codility.lesson15

object CountTriangles {

  def solution(a: Array[Int]): Int = {

    val sorted = a.sorted
    var total = 0
    val n = a.length
    for (p <- 0 until n) {
      var r = p + 2
      for (q <- p + 1 until n) {
        while (r < n && (sorted(p) + sorted(q) > sorted(r)) && (sorted(q) + sorted(r) > sorted(p)) && (sorted(r) + sorted(p) > sorted(q))) {
          r = r + 1
        }
        total = total + r - q - 1
      }
    }
    total
  }
}
