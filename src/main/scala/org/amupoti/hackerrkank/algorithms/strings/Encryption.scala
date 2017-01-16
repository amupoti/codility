package org.amupoti.hackerrkank.algorithms.strings

object Encryption {


  def main(args: Array[String]): Unit = {

    val line = io.Source.stdin.getLines.next()
    println(encrypt(line))

  }

  def encrypt(s: String): String = {

    val (rows, cols) = getL(s.length);
    val matrix = Array.ofDim[Char](rows * cols)
    for (i <- 0 until s.length) matrix(i) = s(i)

    val buf = new StringBuilder
    for (j <- 0 until cols) {
      for (i <- 0 until rows) {

        val c = matrix(j + i * cols)
        if (c.isLetter) buf.append(c)
      }
      if (j < cols - 1) buf.append(" ")
    }

    buf.toString()
  }

  def getL(length: Int): (Int, Int) = {

    val (floor, ceil) = (Math.sqrt(length).floor.toInt, Math.sqrt(length).ceil.toInt)
    if (floor * ceil < length) (floor + 1, ceil)
    else (floor, ceil)
  }

}
