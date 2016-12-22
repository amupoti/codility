package org.amupoti.hackerrkank.functional

import org.amupoti.hackerrkank.adhoc.JumpingBunnies
import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class JumpingBunniesTest extends FunSuite {

  test("Bunnies jumping 2 3 and 4 must meet at 12") {
    assert(12 == JumpingBunnies.findNextJump(Array("2", "3", "4")))
  }

  test("Bunnies jumping 2 and 2 must meet at 2") {
    assert(2 == JumpingBunnies.findNextJump(Array("2", "2")))
  }

  test("Bunnies jumping 1 and 5 must meet at 5") {
    assert(5 == JumpingBunnies.findNextJump(Array("1", "5")))
  }

  test("Bunnies jumping 1 5 7 11 must meet at 385") {
    assert(385 == JumpingBunnies.findNextJump(Array("1", "5", "7", "11")))
  }

  test("Bunnies jumping 1 1 1 2 must meet at 2") {
    assert(2 == JumpingBunnies.findNextJump(Array("1", "1", "1", "2")))
  }

  test("Bunnies jumping 2 4 8 16 must meet at 16") {
    assert(16 == JumpingBunnies.findNextJump(Array("2", "4", "16", "8")))
  }
  test("Big numbers 157 151 149 139 137 131 127 113") {
    assert(BigInt(126459568506372769L) == JumpingBunnies.findNextJump(Array("157", "151", "149", "139","137","131","127","113")))
  }


}
