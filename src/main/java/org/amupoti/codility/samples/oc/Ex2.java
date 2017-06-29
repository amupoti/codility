package org.amupoti.codility.samples.oc;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.counting;
import static java.util.stream.Collectors.groupingBy;

/**
 * Created by Marcel on 28/06/2017.
 */
public class Ex2 {

    public int solution(int[] A) {

        //groupingBy should be linear
        Map<Integer, Long> itemCountMap = Arrays.
                stream(A).
                boxed().
                collect(groupingBy(identity(), counting()));

        Optional<Entry<Integer, Long>> ocurredMostOften = itemCountMap.
                entrySet().
                stream().
                sorted(comparingByValue(reverseOrder())).
                findFirst();

        //We are not supposed to receive empty input, but we handle it anyway
        if (ocurredMostOften.isPresent()) {
            return ocurredMostOften.get().getKey();
        } else {
            return -1;
        }

    }

    public int solution2(int[] A) {
        // write your code in Java SE 8

        //Not sure of how efficiency of groupby is detected by codility, so computing it for every entry
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < A.length; i++) {
            map.putIfAbsent(A[i], 0);
            map.compute(A[i], (k, v) -> v + 1);
        }

        Optional<Entry<Integer, Integer>> mostOften = map.
                entrySet().
                stream().
                sorted(Entry.<Integer, Integer>comparingByValue().reversed()).
                findFirst();
        //We are not supposed to receive empty input, but we handle it anyway
        if (mostOften.isPresent()) {
            return mostOften.get().getKey();
        } else {
            return -1;
        }

    }
}
