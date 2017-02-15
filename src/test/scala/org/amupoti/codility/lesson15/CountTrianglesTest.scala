package org.amupoti.codility.lesson15

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class CountTrianglesTest extends FunSuite {

  test("Sample must be 4") {

    assert(4 == CountTriangles.solution(Array(10, 2, 5, 1, 8, 12)))
  }
}
