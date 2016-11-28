package org.amupoti.hackerrkank.functional

/**
  * https://www.hackerrank.com/challenges/rotate-string
  */

object RotateString {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    for (ln <- io.Source.stdin.getLines) {
      if (!ln.matches("""\d+"""))
        println(generateRotations(ln).mkString(" "))
    }
  }

  def generateRotations(str: String): List[String] = {

    //Take string length
    val l = str.length
    (1 to l).scanLeft(str)((str, _) => ((str.substring(1, l)) + (str.substring(0, 1)))).toList.tail

    //
  }

}
