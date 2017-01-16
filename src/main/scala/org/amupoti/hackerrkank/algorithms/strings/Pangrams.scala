package org.amupoti.hackerrkank.algorithms.strings

object Pangrams {


  def main(args: Array[String]): Unit = {

    val line = io.Source.stdin.getLines.next()
    println(checkPangram(line))

  }

  def checkPangram(line: String): String = {

    val length = line.toLowerCase.diff(Seq(" ")).distinct.length

    length == 26 match {
      case true => "pangram"
      case false => "not pangram"
    }

  }


}
