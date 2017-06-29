package org.amupoti.codility.challenges;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Marcel on 29/06/2017.
 */
public class LongestPassword {
    public static int solution(String S) {
        // write your code in Java SE 8
        List<String> passwords = Arrays.stream(S.split(" ")).
                filter(s -> s.matches("^[a-zA-Z0-9]*$")).
                filter(s -> containsEvenLettersAndOddNumbers(s)).
                collect(Collectors.toList());
        if (passwords.size() == 0) return -1;
        else {
            return passwords.stream().sorted((x, y) -> Integer.compare(y.length(), x.length())).findFirst().get().length();
        }

    }

    private static boolean containsEvenLettersAndOddNumbers(String s) {
        boolean oddNumbers = s.replaceAll("[a-zA-Z]", "").length() % 2 == 1;
        boolean evenLetters = s.replaceAll("[0-9]", "").length() % 2 == 0;
        return oddNumbers && evenLetters;

    }
}
