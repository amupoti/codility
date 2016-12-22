package org.amupoti.hackerrkank.adhoc

/**
  * https://www.hackerrank.com/challenges/remove-duplicates
  */
object RemoveDuplicates {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    for (ln <- io.Source.stdin.getLines) {

      println(removeDuplicates(ln))
    }

  }

  def removeDuplicates(str: String): String = {

    str.foldLeft("")((acc, c) => if (!acc.contains(c)) acc + c else acc)

    //    val result = str.foldLeft((new StringBuilder, Set[Char]()))((acc, c) => {
    //      if (!(acc._2).contains(c)) {
    //        (acc._1.append(c), acc._2 + c)
    //      } else acc
    //    })
    //    result._1.toString()
  }
}
