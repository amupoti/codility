package org.amupoti.codility.samples.oc;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex1Test {
    @Test
    public void solution() throws Exception {
        Ex1 ex1 = new Ex1();
        assertEquals(5, ex1.solution(new int[]{1, 2, 5, 10, 20, 1}));
        assertEquals(3, ex1.solution(new int[]{3, 1, 2, 5, 10, 20, 1}));
        assertEquals(2, ex1.solution(new int[]{1, 2}));
        assertEquals(2, ex1.solution(new int[]{1, 2, 3}));
    }
}