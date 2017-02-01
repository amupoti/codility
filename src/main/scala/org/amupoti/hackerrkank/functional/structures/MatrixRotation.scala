package org.amupoti.hackerrkank.functional.structures

object MatrixRotation {


  def main(args: Array[String]): Unit = {

    val iter = io.Source.stdin.getLines
    val params = iter.next().split(" ").map(_.toInt)
    val (rows, cols, k) = (params(0), params(1), params(2))

    val matrix = Array.ofDim[Int](rows, cols)
    for (i <- 1 to rows) matrix(i) = iter.next().toCharArray.map(_.toInt)

    rotateMatrix(rows, cols, k, matrix)

  }

  def toList(matrix: Array[Array[Int]], rows: Int, cols: Int, k: Int): Array[Int] = {
    val l = Array.ofDim[Int](2 * cols + 2 * rows - 4)

    var c = List[Int]()

    val t = matrix.transpose
    t(0).foreach(i => c = i :: c)
    c = c.tail
    matrix(rows - 1).foreach(i => c = i :: c)
    c = c.tail
    t(rows - 1).reverse.foreach(i => c = i :: c)
    c = c.tail
    matrix(0).reverse.foreach(i => c = i :: c)
    val a = c.tail.reverse.toArray
    val rotated = a.drop(k) ++ a.take(k)

    println("Original")
    c.foreach(println(_))
    println("Transformed")
    rotated.foreach(println(_))


    l
  }

  def rotateMatrix(rows: Int, cols: Int, k: Int, matrix: Array[Array[Int]]): Array[Array[Int]] = {

    // matrix.foreach(_.foreach(println(_)))
    val list = toList(matrix, rows, cols, k)

    Array(Array(1))
  }


}
