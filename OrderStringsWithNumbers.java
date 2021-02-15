/*
Each word in a given string will contain a single number. This number is the position the word should be in the result.
(Note: Numbers can be from 1 to 9).

Reorder the string so that words appear in the right order.
*/

import java.util.Arrays;
import java.util.Comparator;

public class Order {
  public static String order(String words) {
    return Arrays.stream(words.split(" "))
      .sorted(Comparator.comparing(s -> Integer.valueOf(s.replaceAll("\\D", ""))))
      .reduce((a, b) -> a + " " + b).get();
  }
}