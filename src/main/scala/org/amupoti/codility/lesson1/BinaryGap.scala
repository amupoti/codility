package org.amupoti.codility.lesson1


class BinaryGap {
  def sequential(n: Int): Int = {
    // write your code in Scala 2.12
    val b = n.toBinaryString
    var max = 0
    var length = 0
    for (i <- 0 until b.size) {
      if (b(i) == '0') length += 1
      else {
        if (length > max) {
          max = length
        }
        length = 0
      }
    }

    max
  }

  def recursive(n: Int): Int = {
    val b = n.toBinaryString

    def loop(str: String, max: Int): (Int) = {
      if (str.length <= 1) max
      else {
        val (gap, end) = findGaps(str)
        if (gap == -1) max
        else if (gap > max) {
          loop(str.substring(end), gap)
        } else loop(str.substring(end), max)
      }
    }

    def findGaps(str: String) = {

      val init = str.indexOf("10")
      val end = str.indexOf("01")
      val noResult = (-1, 0)

      if (init == -1 || end == -1) noResult
      else if (end > init) (end - init, end + 1)
      else noResult

    }

    loop(b, 0)

  }
}

