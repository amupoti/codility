package org.amupoti.hackerrkank.algorithms

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class FlippingMatrixTest extends FunSuite {

  test("Flip 4x4 matrix max should be 414") {

    assert(414 == FlippingMatrix.computeMaxSum(Array(Array(112, 42, 83, 119), Array(56, 125, 56, 49), Array(15, 78, 101, 43), Array(62, 98, 114, 108)), 2))

  }


}
