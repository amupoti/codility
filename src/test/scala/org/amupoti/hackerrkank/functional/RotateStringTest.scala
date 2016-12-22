package org.amupoti.hackerrkank.functional

import org.amupoti.hackerrkank.adhoc.RotateString
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class RotateStringTest extends FunSuite {

  test("Rotate must return 3 combinations") {
    assert(RotateString.generateRotations("abc") === List("bca", "cab", "abc"))
  }
  test("Rotate must return identity") {
    assert(RotateString.generateRotations("aaa") === List("aaa", "aaa", "aaa"))
  }
}
