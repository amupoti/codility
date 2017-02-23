package org.amupoti.hackerrkank.codinginterview

import org.amupoti.hackerrank.codinginterview
import org.amupoti.hackerrank.codinginterview.MakingAnagrams
import org.amupoti.hackerrkank.adhoc
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MakingAnagramsTest extends FunSuite {

  test("Sample strings") {
    assert(4 == MakingAnagrams.computeRemovedLetters("cde","abc"))
  }

  test("Sample strings with repeated letters") {
    assert(3 == codinginterview.MakingAnagrams.computeRemovedLetters("aaab","abc"))
  }
}
