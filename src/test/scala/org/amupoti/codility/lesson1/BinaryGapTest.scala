package org.amupoti.codility.lesson1

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class BinaryGapTest extends FunSuite {

  val bg = new BinaryGap();

  test("Sequential for 1041 must be 5") {
    assert(bg.sequential(1041) == 5)
  }

  test("Sequential for 9 must be 2") {
    assert(bg.sequential(9) == 2)
  }

  test("Sequential for 15 must be 0") {
    assert(bg.sequential(15) == 0)
  }

  test("Recursive for 1041 must be 5") {
    assert(bg.recursive(1041) == 5)
  }

  test("Recursive for 529 must be 4") {
    assert(bg.recursive(529) == 4)
  }

  test("Recursive for 15 must be 0") {
    assert(bg.recursive(15) == 0)
  }

}
