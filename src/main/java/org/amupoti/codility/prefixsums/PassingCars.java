package org.amupoti.codility.prefixsums;

/**
 * Created by Marcel on 28/06/2017.
 */
public class PassingCars {

    public static int solution(int[] A) {
        // write your code in Java SE 8
        int increment = 0;
        int total = 0;
        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                increment++;
            } else {
                total += increment;
            }
        }

        if (total > 1000000000) return -1;
        else return total;
    }

}
