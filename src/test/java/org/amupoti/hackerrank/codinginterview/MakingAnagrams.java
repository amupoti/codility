package org.amupoti.hackerrank.codinginterview;

import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MakingAnagrams {

  public static int numberNeeded(String first, String second) {

    long sameChars = getSameLettersCount(first, second);

    return first.length() + second.length() - 2 * (int) sameChars;

  }

  private static long getSameLettersCount(String first, String second) {
    Map<Integer, Long> groupFirst = first.chars().mapToObj(i -> new Integer(i))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    Map<Integer, Long> groupSecond = second.chars().mapToObj(i -> new Integer(i))
        .collect(Collectors.groupingBy(c -> c, Collectors.counting()));

    return groupFirst.entrySet().stream().filter(e -> groupSecond.containsKey(e.getKey()))
        .mapToLong(e -> Math.min(e.getValue(), groupSecond.get(e.getKey()))).sum();
  }

  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    String a = in.next();
    String b = in.next();
    System.out.println(numberNeeded(a, b));
  }
}
