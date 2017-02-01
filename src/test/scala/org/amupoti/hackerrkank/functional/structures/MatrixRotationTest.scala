package org.amupoti.hackerrkank.functional.structures

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MatrixRotationTest extends FunSuite {

  test("Rotating matrix 1 ") {
    assert(
      Array(
        Array(2, 3, 4, 8),
        Array(1, 7, 11, 12),
        Array(5, 6, 10, 16),
        Array(9, 13, 14, 15)
      )
        == MatrixRotation.rotateMatrix(4, 4, 1, Array(
        Array(1, 2, 3, 4),
        Array(5, 6, 7, 8),
        Array(9, 10, 11, 12),
        Array(13, 14, 15, 16)
      )))
  }

}
