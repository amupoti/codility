package org.amupoti.hackerrkank.statistics;

import java.util.HashMap;
import java.util.Map;

public class MeanModeImperative implements MeanMode {

  public float calculateMean(int[] values) {

    float total = 0;
    float elems = 0;
    for (int i = 0; i < values.length; i++) {
      if (values[i] <= 1000000) {
        total += values[i];
        elems++;
      }
    }
    float mean = total / elems;
    return mean;
  }

  public float calculateMode(int[] values) {

    Map<Integer, Integer> frequency = new HashMap<>();
    for (int i = 0; i < values.length; i++) {
      int value = values[i];
      Integer mapValue = frequency.get(value);
      if (mapValue == null) {
        frequency.put(value, 0);
      } else {
        frequency.put(value, mapValue + 1);
      }
    }

    int max = 0;
    int mode = -1;
    boolean sameThanPrevFrequency = true;
    int prevFreq = frequency.values().iterator().next();
    for (Integer value : frequency.keySet()) {
      if (frequency.get(value) > max) {
        max = frequency.get(value);
        mode = value;
      }

      sameThanPrevFrequency &= prevFreq == frequency.get(value);

    }
    if (sameThanPrevFrequency) throw new RuntimeException("No mode found");

    return mode;

  }

}
