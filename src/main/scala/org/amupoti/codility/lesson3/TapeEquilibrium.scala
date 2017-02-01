package org.amupoti.codility.lesson3

class TapeEquilibrium {

  def solution(a: Array[Int]): Int = {

    val total = a.sum
    val first = a(0)
    val (_, list) = a.drop(1).foldLeft((first, List[Int]()))((acc, current) => (acc._1 + current,
      Math.abs(acc._1 - (total - acc._1)) :: acc._2))
    list.min
  }
}
