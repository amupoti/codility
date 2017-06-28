package org.amupoti.codility.sorting;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by Marcel on 28/06/2017.
 */
public class MaxProductOfThreeTest {

    @Test
    public void testSample() {
        Assert.assertEquals(60, MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, 5, 6}));
        Assert.assertEquals(300, MaxProductOfThree.solution(new int[]{-3, 10, 2, -2, 5, 6}));
        Assert.assertEquals(-4, MaxProductOfThree.solution(new int[]{-3, -1, -2, -2, -5, -6}));
        Assert.assertEquals(30, MaxProductOfThree.solution(new int[]{-3, 1, 2, -2, -5, 0}));
        Assert.assertEquals(36, MaxProductOfThree.solution(new int[]{-3, 1, -2, -2, 5, 6}));

    }

}