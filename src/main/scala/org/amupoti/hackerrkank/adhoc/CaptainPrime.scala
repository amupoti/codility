package org.amupoti.hackerrkank.adhoc

object CaptainPrime {

  def main(args: Array[String]) {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution
*/

    val iter = io.Source.stdin.getLines
    iter.next()
    computeFate(iter.toList).foreach(println(_))
  }

  def computeFate(persons: List[String]): List[String] = persons map computePosition

  def allLeftPrimes(p: String): Boolean = 1 until p.length forall (c => isStringPrime(p.substring(c)))

  def allRightPrimes(p: String): Boolean = 1 until p.length forall (c => isStringPrime(p.substring(0, p.length - c)))


  def computePosition(person: String): String = {
    val p = person.toInt
    if (!isPrime(p) || person.contains('0')) "DEAD"
    else {
      (allLeftPrimes(person), allRightPrimes(person)) match {

        case (true, true) => "CENTRAL"
        case (true, false) => "LEFT"
        case (false, true) => "RIGHT"
        case _ => "DEAD"
      }
    }
  }

  def isPrime(n: Int): Boolean = n != 1 && (2 until n forall (n % _ != 0))

  def isStringPrime(s: String): Boolean = isPrime(s.toInt)

}
