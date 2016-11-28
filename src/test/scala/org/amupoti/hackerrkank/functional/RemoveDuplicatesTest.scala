package org.amupoti.hackerrkank.functional

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner


@RunWith(classOf[JUnitRunner])
class RemoveDuplicatesTest extends FunSuite {

  test("abcbababac must return abc") {
    assert(RemoveDuplicates.removeDuplicates("abcbababac") === ("abc"))
  }
  test("abcdacdbacdabcda must return abcd") {
    assert(RemoveDuplicates.removeDuplicates("abcdacdbacdabcda") === ("abcd"))
  }
  test("a must return a") {
    assert(RemoveDuplicates.removeDuplicates("a") === ("a"))
  }
  test(" \"\" must return \"\"") {
    assert(RemoveDuplicates.removeDuplicates("") === (""))
  }
}
