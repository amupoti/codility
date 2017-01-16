package org.amupoti.hackerrkank.algorithms.greedy

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MaxMinTest extends FunSuite {

  test("Sample 3 100") {

    assert(20 == MaxMin.computeUnfairness(3, List(10, 100, 300, 200, 1000, 20, 30)))

  }

  test("Sample 10 4") {

    assert(3 == MaxMin.computeUnfairness(4, List(1, 2, 3, 4, 10, 20, 30, 40, 100, 200)))

  }


  test("Last test") {

    assert(2 == MaxMin.computeUnfairness(3, List(100, 200, 300, 350, 400, 401, 402)))

  }

}
