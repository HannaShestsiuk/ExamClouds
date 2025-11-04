/**
 * Слово с минимальным числом символов
 * Найти слово, в котором число различных символов минимально.
 * Слово может содержать буквы и цифры.
 * Если таких слов несколько, найти первое из них.
 * Например, в строке "fffff ab f 1234 jkjk" найденное слово должно быть "fffff".
 */
package lesson14_strings;

import java.util.HashSet;
import java.util.Set;

public class X_SplitAndSearch {
    public static void main(String[] args) {
        String text = "fffff ab f 1234 jkjk";

        String[] words = text.split("\\s+");
        String result = "";
        int minUnique = Integer.MAX_VALUE;

        for (String word : words) {
            Set<Character> uniqueChars = new HashSet<>();
            for (char c : word.toCharArray()) {
                uniqueChars.add(c);
            }

            if (uniqueChars.size() < minUnique) {
                minUnique = uniqueChars.size();
                result = word;
            }
        }

        System.out.println("Word with minimal unique characters: " + result);
    }
}
