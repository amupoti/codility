package org.amupoti.hackerrkank.statistics;

import junit.framework.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class MeanModeTest {

  private MeanMode m;
  @Rule
  public ExpectedException expectedException = ExpectedException.none();

  @Before
  public void init() {
    m = getMeanMode();

  }

  @Test
  public void computeMode() throws Exception {
    int[] values = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060, 4978 };
    Assert.assertEquals(4978.0, m.calculateMode(values), 0.1);
  }

  private MeanMode getMeanMode() {
    return new MeanModeImperative();
  }

  @Test
  public void computeModeSameFrequency() throws Exception {
    int[] values = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060, 4978,
        67060, 4978 };
    MeanMode m = getMeanMode();
    Assert.assertEquals(4978.0, m.calculateMode(values), 0.1);
  }

  @Test
  public void computeModeAllEqual() throws Exception {
    int[] values = { 1, 1, 1, 1, 1, 1, 1 };
    MeanMode m = getMeanMode();
    expectedException.expect(RuntimeException.class);
    m.calculateMode(values);
  }

  @Test
  public void computeMean() throws Exception {
    int[] values = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135, 67060, 4978 };
    MeanMode m = getMeanMode();
    Assert.assertEquals(40362.1, m.calculateMean(values), 0.1);
  }

  @Test
  public void computeMeanWithBigValues() throws Exception {
    MeanMode m = getMeanMode();
    int[] valuesWithBigNumber = { 64630, 11735, 14216, 99233, 14470, 4978, 73429, 38120, 51135,
        67060, 4978, 1000001 };
    Assert.assertEquals(40362.1, m.calculateMean(valuesWithBigNumber), 0.1);
  }

}