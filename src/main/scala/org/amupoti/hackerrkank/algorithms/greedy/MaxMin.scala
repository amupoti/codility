package org.amupoti.hackerrkank.algorithms.greedy

object MaxMin {


  def main(args: Array[String]): Unit = {

    val lines = io.Source.stdin.getLines
    lines.next()
    val k = lines.next().toInt
    val values = lines.toList.map(_.toInt)
    println(computeUnfairness(k, values).toString)

  }

  def computeUnfairness(k: Int, values: List[Int]): Int = {
    val valSorted = values.sorted.toArray
    (0 to values.length - k).map(i => valSorted(i + k - 1) - valSorted(i)).min
  }


}
