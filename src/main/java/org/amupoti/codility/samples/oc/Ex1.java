package org.amupoti.codility.samples.oc;

import java.util.Arrays;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex1 {

    public int solution(int[] A) {

        Arrays.sort(A);
        return A[A.length / 2];

    }
}
