package org.amupoti.codility.samples.oc;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex2Test {

    @Test
    public void solution() throws Exception {
        Ex2 ex2 = new Ex2();
        assertEquals(10, ex2.solution(new int[]{20, 10, 30, 30, 40, 10}));
        assertEquals(1, ex2.solution(new int[]{1}));
        assertEquals(-1, ex2.solution(new int[]{}));
        assertEquals(-3, ex2.solution(new int[]{1, 2, -3, -3}));
        assertEquals(1, ex2.solution(new int[]{1, 2}));
        assertEquals(-100, ex2.solution(new int[]{-100, 233, -100}));
    }
}