package org.amupoti.codility.arrays;

import junit.framework.Assert;
import org.junit.Test;

public class OddOccurrencesTest {

  @Test
  public void findSingle() throws Exception {
    OddOccurrences oc = new OddOccurrences();
    Assert.assertEquals(3, oc.findSingle(new int[] { 1, 2, 3, 2, 1 }));
  }
  public void findSingleFunctional() throws Exception {
    OddOccurrences oc = new OddOccurrences();
    Assert.assertEquals(3, oc.findSingleFunctional(new int[] { 1, 2, 3, 2, 1 }));
  }

}