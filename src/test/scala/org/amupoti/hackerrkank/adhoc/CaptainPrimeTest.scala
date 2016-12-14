package org.amupoti.hackerrkank.adhoc

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class CaptainPrimeTest extends FunSuite {

  test("Placement of five people should be C L R D D") {
    assert(List("CENTRAL", "LEFT", "RIGHT", "DEAD", "DEAD") == CaptainPrime.computeFate(List("3137", "1367", "2333", "101", "12")))
  }

  test("Placement of 10 people should correct") {
    assert(List("DEAD", "LEFT", "DEAD", "DEAD", "DEAD", "DEAD", "DEAD", "DEAD", "DEAD", "DEAD") ==
      CaptainPrime.computeFate(List("35", "2113", "198932", "462336", "696964", "852819", "235033", "155234", "567361", "184034")))
  }

  test("2113 must be left") {
    assert(List("LEFT") == CaptainPrime.computeFate(List("2113")))
  }

  test("17 is prime") {
    assert(true == CaptainPrime.isPrime(17))
  }

  test("541 is prime") {
    assert(true == CaptainPrime.isPrime(541))
  }

  test("101 is prime") {
    assert(true == CaptainPrime.isPrime(101))
  }
  test("1 is not prime") {
    assert(false == CaptainPrime.isPrime(1))
  }


}
