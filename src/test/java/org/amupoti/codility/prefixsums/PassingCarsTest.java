package org.amupoti.codility.prefixsums;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcel on 28/06/2017.
 */
public class PassingCarsTest {
    @Test
    public void sample() throws Exception {

        Assert.assertEquals(5, PassingCars.solution(new int[]{0, 1, 0, 1, 1}));
    }

    @Test
    public void sample0() throws Exception {

        Assert.assertEquals(0, PassingCars.solution(new int[]{0, 0, 0, 0, 0}));
    }

    @Test
    public void sample1() throws Exception {

        Assert.assertEquals(0, PassingCars.solution(new int[]{1, 1, 1, 1, 1}));
    }

    @Test
    public void sampleOne1() throws Exception {

        Assert.assertEquals(3, PassingCars.solution(new int[]{1, 0, 1, 1, 1}));
    }

}