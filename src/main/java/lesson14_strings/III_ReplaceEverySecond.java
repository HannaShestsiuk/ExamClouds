/**
 * Заменить каждое второе вхождение строки
 * Напишите метод, заменяющий в строке каждое второе вхождение «object-oriented programming»
 * (не учитываем регистр символов) на «OOP».
 * Например, строка
 *      "Object-oriented programming is a programming language model
 *      organized around objects rather than "actions"
 *      and data rather than logic. Object-oriented programming blabla.
 *      Object-oriented programming bla."
 *  должна быть преобразована в
 *      "Object-oriented programming is a programming language model
 *      organized around objects rather than "actions"
 *      and data rather than logic. OOP blabla.
 *      Object-oriented programming bla."
 */
package lesson14_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class III_ReplaceEverySecond {
    public static void main(String[] args) {
        String string = """
                Object-oriented programming is a programming language model
                organized around objects rather than "actions"
                and data rather than logic. Object-oriented programming blabla.
                Object-oriented programming bla.
                Object-oriented programming.
                """;

        String result = replaceEverySecond(string, "object-oriented programming", "OOP");
        System.out.println(result);
    }

    public static String replaceEverySecond(String string, String target, String replacement) {
        // Create a case-insensitive pattern
        Pattern pattern = Pattern.compile(target, Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(string);

        StringBuilder sb = new StringBuilder();
        int count = 0;

        while (matcher.find()) {
            count++;
            // replace every second
            if (count % 2 == 0) {
                // Add substring with replacement
                matcher.appendReplacement(sb, replacement);
            }
        }

        matcher.appendTail(sb);
        return sb.toString();
    }
}
