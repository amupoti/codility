package org.amupoti.codility.arrays;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class OddOccurrences {

  public int findSingle(int[] A) {

    Set<Integer> set = new HashSet<>();
    for (int i = 0; i < A.length; i++) {
      if (set.contains(A[i])) {
        set.remove(A[i]);
      } else
        set.add(A[i]);
    }

    return set.iterator().next();
  }

  public int findSingleFunctional(int[] A) {

    Map<Integer, Long> collect = Arrays.stream(A).mapToObj(i -> new Integer(i))
        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

    Optional<Map.Entry<Integer, Long>> value = collect.entrySet().stream()
        .filter(e -> e.getValue() == 0).findFirst();

    return value.get().getKey();
  }

}
