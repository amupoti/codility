package org.amupoti.hackerrkank.codinginterview

object ArraysLeftRotation {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    val iter = io.Source.stdin.getLines
    val shifts = iter.next().split(" ")(1).toInt
    val numbers = iter.next().split(" ")

    println(computeShift(shifts, numbers).mkString(" "))

  }

  def computeShift(shifts: Int, numbers: Array[String]): Array[String] = {
    numbers.slice(shifts, numbers.length) ++ (numbers.slice(0, shifts))

  }

  /**
    * Here we generated all the numbers
    */
  def computeShift2(shifts: Int, numbers: Array[String]): Array[String] = {

    (shifts until numbers.length) ++ (0 until shifts) map numbers toArray

  }


}
