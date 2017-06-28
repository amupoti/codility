package org.amupoti.codility.counting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcel on 28/06/2017.
 */
public class MaxCountersTest {
    @Test
    public void testSampleSolutionGiven() throws Exception {
        int[] given = new int[]{3, 4, 4, 6, 1, 4, 4};
        int[] expected = new int[]{3, 2, 2, 4, 2};
        Assert.assertArrayEquals(expected, MaxCounters.solution(5, given));
    }

    @Test
    public void testSingle() throws Exception {
        int[] given = new int[]{1};
        int[] expected = new int[]{1, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, MaxCounters.solution(5, given));
    }

    @Test
    public void testSingleWithMax() throws Exception {
        int[] given = new int[]{6};
        int[] expected = new int[]{0, 0, 0, 0, 0};
        Assert.assertArrayEquals(expected, MaxCounters.solution(5, given));
    }

    @Test
    public void testTwiceMax() throws Exception {
        int[] given = new int[]{3, 4, 4, 6, 1, 6, 4};
        int[] expected = new int[]{3, 3, 3, 4, 3};
        Assert.assertArrayEquals(expected, MaxCounters.solution(5, given));
    }


}