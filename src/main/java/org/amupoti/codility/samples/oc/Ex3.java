package org.amupoti.codility.samples.oc;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex3 {

    public int solution(int[] A) {
        // write your code in Java SE 8

        int maxSetLength = 0;
        Set<Integer> visited = new HashSet<>();
        for (int i = 0; i < A.length; i++) {
            //Avoid processing already visited entries to get O(n)
            if (isVisited(i, visited)) continue;
            else {
                int p = i;
                int currentLength = 0;
                while (!isVisited(p, visited)) {
                    visited.add(p);
                    p = A[p];
                    currentLength++;
                    maxSetLength = Math.max(maxSetLength, currentLength);
                }
            }
        }
        return maxSetLength;
    }

    private boolean isVisited(int pos, Set<Integer> visited) {
        return visited.contains(pos);
    }
}
