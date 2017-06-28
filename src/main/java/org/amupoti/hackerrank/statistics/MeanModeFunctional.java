package org.amupoti.hackerrank.statistics;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.Comparator.reverseOrder;
import static java.util.Map.Entry.comparingByValue;
import static java.util.function.Function.identity;
import static java.util.stream.Collectors.*;

public class MeanModeFunctional implements MeanMode {

    public float calculateMean(int[] values) {
        return (float) Arrays.stream(values).filter(n -> n <= 1000000).summaryStatistics().getAverage();
    }

    public float calculateMode(int[] values) {

        Map<Integer, Long> count = Arrays.stream(values).mapToObj(i -> i)
                .collect(groupingBy(identity(), counting()));

        List<Map.Entry<Integer, Long>> groupByFreq = count.entrySet().stream()
                .sorted(comparingByValue(reverseOrder())).collect(toList());

        long differentValues = groupByFreq.stream().map(e -> e.getValue()).distinct().count();
        if (differentValues == 1)
            throw new IllegalArgumentException("All values are equal");

        Map.Entry<Integer, Long> entry = groupByFreq.get(0);
        return entry.getKey();

    }

}
