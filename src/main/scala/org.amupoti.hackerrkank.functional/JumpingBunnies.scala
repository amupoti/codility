package org.amupoti.hackerrkank.functional

object JumpingBunnies {


  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    val iter = io.Source.stdin.getLines
    iter.next()
    println(findNextJump(iter.next().split(" ")))

  }

  def findNextJump(str: Array[String]): BigInt = str.foldLeft(BigInt(1))((acc, str) => lcm(BigInt(str.toInt), acc))

  def lcm(a: BigInt, b: BigInt): BigInt = a * b / gcd(a, b)

  def gcd(a: BigInt, b: BigInt): BigInt = if (b == 0) a else gcd(b, a % b)

}

