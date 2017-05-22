package org.amupoti.codility.greedy

import org.scalatest.FunSuite

class TieRopesTest extends FunSuite {

  test("Sample") {
    assert(3 == TieRopes.solution(4, Array(1, 2, 3, 4, 1, 1, 3)))
  }
  test("Sample with single ropes") {
    assert(7 == TieRopes.solution(1, Array(1, 2, 3, 4, 1, 1, 3)))
  }
  test("Sample with 1 rope") {
    assert(1 == TieRopes.solution(15, Array(1, 2, 3, 4, 1, 1, 3)))
  }

}
