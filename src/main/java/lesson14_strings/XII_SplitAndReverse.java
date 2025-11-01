/**
 * Найти палиндром
 * Предложение состоит из нескольких слов,
 * например: "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554".
 * Среди слов, состоящих только из цифр, найти слово палиндром.
 */
package lesson14_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class XII_SplitAndReverse {
    public static void main(String[] args) {
        String text = "Если есть хвосты по дз, начните с 1 не сданного задания. 123 324 111 4554";

        Pattern pattern = Pattern.compile("\\d{2,}");
        Matcher matcher = pattern.matcher(text);

        while (matcher.find()) {
            String word = matcher.group();
            String reversed = new StringBuilder(word).reverse().toString();
            if (word.equals(reversed)) {
                System.out.println("Found palindrome: " + word);
            }
        }
    }
}
