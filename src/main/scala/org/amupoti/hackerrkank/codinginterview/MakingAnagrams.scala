package org.amupoti.hackerrkank.codinginterview

object MakingAnagrams {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/
    val sc = io.Source.stdin.getLines
    val a = sc.next();
    val b = sc.next();
    println(computeRemovedLetters(a, b))

  }

  def computeRemovedLetters(a: String, b: String): Int = {

    a.length + b.length - (a intersect b).length * 2
  }


}
