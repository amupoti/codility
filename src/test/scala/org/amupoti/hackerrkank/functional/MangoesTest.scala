package org.amupoti.hackerrkank.functional

import org.amupoti.hackerrkank.adhoc.Mangoes
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class MangoesTest extends FunSuite {

  test("Sample mangoes") {
    assert(3==Mangoes.findNumberOfFriends("5 200", "2 5 3 2 4", "30 40 10 20 30"))
  }
}
