package org.amupoti.hackerrkank.algorithms.strings

import org.junit.runner.RunWith
import org.scalatest.FunSuite
import org.scalatest.junit.JUnitRunner

@RunWith(classOf[JUnitRunner])
class EncryptionTest extends FunSuite {

  test("chillout") {

    assert("clu hlt io" == Encryption.encrypt("chillout"))

  }

  test("Feed the doc") {

    assert("fto ehg ee dd" == Encryption.encrypt("feedthedog"))

  }

  test("haveaniceday") {

    assert("hae and via ecy" == Encryption.encrypt("haveaniceday"))

  }


}
