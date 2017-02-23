package org.amupoti.hackerrkank.statistics

object MeanMedianMode {

  def main(args: Array[String]) {

    val lines = io.Source.stdin.getLines()
    lines.next()
    val values = lines.next()
    val v = computeValues(values.map(_.toInt))
    println(v._1 + "\n" + v._2 + "\n" + v._3)

  }


  def computeValues(values: IndexedSeq[Int]): (Double, Double, Double) = {

    val mean: Double = values.sum / values.length.toFloat


    val median: Double = computeMedian(values.sorted)
    val map = values.groupBy(x => x).mapValues(_.size)


    val mode: Double = map.toList.sortBy(v => (v._2, v._1)).reverse.last._1

    (mean, median, mode)
  }

  def computeMedian(values: IndexedSeq[Int]) = {

    val length = values.length
    if (length % 2 == 0) {
      (values(length / 2).toFloat + values((length / 2) - 1)) / 2
    }
    else {
      values((length / 2)).toFloat

    }
  }
}
