/*
Write a function that takes a string and returns a new string with all vowels removed.

For example, the string 'Hello World!' would become 'H ll  W rld!'
*/

public class Vowelless {
    public static String removeVowels(String str) {
      return str.replaceAll("(?i)[aeiou]", "");
    }
}