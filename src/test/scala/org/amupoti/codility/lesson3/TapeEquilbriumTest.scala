package org.amupoti.codility.lesson3

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class TapeEquilbriumTest extends FunSuite {

  test("Sample 1") {

    val t = new TapeEquilibrium

    assert(1 == t.solution(Array(3, 1, 2, 4, 3)))
  }
  test("Two elements") {

    val t = new TapeEquilibrium

    assert(2 == t.solution(Array(1, -1)))
  }

}
