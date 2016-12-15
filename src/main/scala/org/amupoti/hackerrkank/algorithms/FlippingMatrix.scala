package org.amupoti.hackerrkank.algorithms

object FlippingMatrix {

  def main(args: Array[String]): Unit = {

    val iter = io.Source.stdin.getLines
    val numMat = iter.next().toInt
    for (i <- 1 to numMat) {
      val n = iter.next().toInt
      val matrix = Array.ofDim[Int](2 * n, 2 * n)
      for (j <- 1 to 2 * n) matrix(j - 1) = iter.next().split(" ").map(_.toInt)
      println(computeMaxSum(matrix, n))
    }


  }

  def computeMaxSum(matrix: Array[Array[Int]], n: Int): Any = {


    val bound = 2 * n - 1
    val maxList = for (
      i <- 0 until n;
      j <- 0 until n
    ) yield (
      Seq(matrix(0 + j)(0 + i), matrix(0 + j)(bound - i), matrix(bound - j)(i), matrix(bound - j)(bound - i)).max
      )
    maxList.sum

  }


}
