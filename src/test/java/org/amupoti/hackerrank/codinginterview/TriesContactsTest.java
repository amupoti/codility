package org.amupoti.hackerrank.codinginterview;

import junit.framework.Assert;
import org.junit.Test;

public class TriesContactsTest {

  String add = "add";
  String find = "find";

  @Test
  public void performSample() {
    TriesContacts tc = new TriesContacts();
    tc.performOp(add, "hack");
    tc.performOp(add, "hackerrank");
    Assert.assertEquals(2, tc.performOp(find, "hack"));
    Assert.assertEquals(0, tc.performOp(find, "hak"));
  }

  @Test
  public void testFindOneContact() {
    TriesContacts tc = new TriesContacts();
    tc.performOp(add, "Marcel");
    tc.performOp(add, "Marcellus");
    Assert.assertEquals(1, tc.performOp(find, "Marcellus"));
  }

  @Test
  public void testFindWithManyContacts() {

    TriesContacts tc = new TriesContacts();
    for (int i = 0; i < 100000; i++) {
      tc.performOp(add, "Marcel" + i);
      tc.performOp(find, "asd" + i);

    }

    Assert.assertEquals(100000, tc.performOp(find, "Marc"));
  }

}