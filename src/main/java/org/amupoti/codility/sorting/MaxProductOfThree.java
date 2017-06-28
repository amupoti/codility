package org.amupoti.codility.sorting;

import java.util.Arrays;

/**
 * Created by Marcel on 28/06/2017.
 */
public class MaxProductOfThree {

    public static int solution(int[] A) {
        Arrays.sort(A);
        int length = A.length;
        return Math.max(A[length - 1] * A[length - 2] * A[length - 3], A[length - 1] * A[0] * A[1]);


    }

}
