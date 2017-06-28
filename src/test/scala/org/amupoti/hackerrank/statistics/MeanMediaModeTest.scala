package org.amupoti.hackerrank.statistics

import org.junit.runner.RunWith
import org.scalactic.TolerantNumerics
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MeanMediaModeTest extends FunSuite {

  val epsilon = 0.01
  implicit val doubleEq = TolerantNumerics.tolerantDoubleEquality(epsilon)

  test("compute mean sample") {
    val (mean, media, mode) = MeanMedianMode.computeValues(IndexedSeq(64630, 11735,
      14216,
      99233, 14470, 4978, 73429, 38120, 51135, 67060))

    assert(mean === 43900.6)
    assert(media == 44627.5)
    assert(mode == 4978.0)

  }
}
