package org.amupoti.codility.samples.oc;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static junit.framework.Assert.assertEquals;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex3Test {

    @Test
    public void solution() throws Exception {
        Ex3 ex3 = new Ex3();
        assertEquals(4, ex3.solution(new int[]{5, 4, 0, 3, 1, 6, 2}));
        assertEquals(1, ex3.solution(new int[]{0}));
        assertEquals(0, ex3.solution(new int[]{}));
        assertEquals(2, ex3.solution(new int[]{1, 0}));
        assertEquals(1, ex3.solution(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8}));

        List<Integer> l = new ArrayList<>();
        for (int i = 1; i < 1000000; i++) {
            l.add(i);
        }
        l.add(0);
        assertEquals(1000000, ex3.solution(l.stream().mapToInt(i -> i).toArray()));
    }

}