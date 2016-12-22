package org.amupoti.hackerrkank.codingInterview

import org.amupoti.hackerrkank.codinginterview.ArraysLeftRotation
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class ArraysLeftRotationTest extends FunSuite {

  test("Test shift 2") {
    assert(Array("1", "2", "3", "4") sameElements ArraysLeftRotation.computeShift(2, Array("3", "4", "1", "2")))
  }

  test("Test shift 4") {
    assert(Array("1", "2", "3", "4") sameElements ArraysLeftRotation.computeShift(4, Array("1", "2", "3", "4")))
  }

  test("Test no shift") {
    assert(Array("1", "2", "3", "4") sameElements ArraysLeftRotation.computeShift(0, Array("1", "2", "3", "4")))
  }


}
