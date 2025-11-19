/**
 * Найти количество слов
 * Предложение состоит из нескольких слов, разделенных пробелами.
 * Например: "One two three раз два три one1 two2 123 ".
 * Найти количество слов, содержащих только символы латинского алфавита.
 */
package lesson14_strings;

public class XI_SplitAndFilter {
    public static void main(String[] args) {
        String text = "One two three раз два три one1 two2 123 ";

        String[] words = text.split("\\s+");
        int count = 0;

        for (String word : words) {
            if (word.matches("[a-zA-Z]+")) {
                count++;
            }
        }

        System.out.println("Number of words with only Latin letters: " + count);
    }
}
