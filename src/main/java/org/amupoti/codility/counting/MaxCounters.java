package org.amupoti.codility.counting;

/**
 * Created by Marcel on 28/06/2017.
 */
public class MaxCounters {

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8

        int[] values = new int[N];
        int max = 0;
        int allShouldBeAt = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] != N + 1) {
                if (values[A[i] - 1] < allShouldBeAt) values[A[i] - 1] = allShouldBeAt;
                values[A[i] - 1]++;
                max = Math.max(max, values[A[i] - 1]);
            } else {

                allShouldBeAt = max;
            }
        }

        for (int i = 0; i < values.length; i++) {
            if (values[i] < allShouldBeAt) {
                values[i] = allShouldBeAt;
            }
        }

        return values;
    }

}
