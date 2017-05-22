package org.amupoti.codility.greedy

object TieRopes {

  def solution(k: Int, a: Array[Int]): Int = {
    // write your code in Scala 2.12
    var sum = 0
    var ropes = 0
    for (i <- 0 until a.length) {
      sum += a(i)
      if (sum >= k) {
        ropes += 1
        sum = 0
      }
    }
    ropes
  }
}
