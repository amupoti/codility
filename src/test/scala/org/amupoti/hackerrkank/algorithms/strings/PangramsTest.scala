package org.amupoti.hackerrkank.algorithms.strings

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class PangramsTest extends FunSuite {

  test("We promptly judged antique ivory buckles for the prize is not a pangram") {

    assert("not pangram" == Pangrams.checkPangram("We promptly judged antique ivory buckles for the prize"))

  }

  test("We promptly judged antique ivory buckles for the next prize is a pangram") {

    assert("pangram" == Pangrams.checkPangram("We promptly judged antique ivory buckles for next the prize"))

  }

  test("The quick brown fox jumps over the lazy dog is a pangram") {

    assert("pangram" == Pangrams.checkPangram("The quick brown fox jumps over the lazy dog"))

  }


}
