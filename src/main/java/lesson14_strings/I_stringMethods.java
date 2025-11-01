/**
 * Практика методов класса String
 * 1. Напишите метод, который принимает в качестве параметра любую строку, например “I like Java!!!”.
 * 2. Распечатать последний символ строки. Используем метод String.charAt().
 * 3. Проверить, заканчивается ли ваша строка подстрокой “!!!”. Используем метод String.endsWith().
 * 4. Проверить, начинается ли ваша строка подстрокой “I like”. Используем метод String.startsWith().
 * 5. Проверить, содержит ли ваша строка подстроку “Java”. Используем метод String.contains().
 * 6. Найти позицию подстроки “Java” в строке “I like Java!!!”.
 * 7. Заменить все символы “а” на “о”.
 * 8. Преобразуйте строку к верхнему регистру.
 * 9. Преобразуйте строку к нижнему регистру.
 */
package lesson14_strings;

public class I_stringMethods {
    public static void main(String[] args) {
        compareSting("I like Java!!!");
        compareSting("I Like Java!!!");
        compareSting("I like C++!!!");
    }

    public static void compareSting(String str) {
        System.out.println(str);

        char lastChar = str.charAt(str.length() - 1);
        System.out.println("The last character: " + lastChar);

        boolean endsWith = str.endsWith("!!!");
        System.out.println("The string ends with '!!!': " + endsWith);

        boolean startsWith = str.startsWith("I like");
        System.out.println("The string starts with 'I like': " + startsWith);

        boolean contains = str.contains("Java");
        System.out.println("The string contains 'Java': " + contains);

        int index = str.indexOf("Java");
        System.out.println("Position of 'Java': " + index);

        String replaced = str.replace('a', 'o');
        System.out.println("Replace 'a' with 'o': " + replaced);

        String upper = str.toUpperCase();
        System.out.println("The string in upper case: " + upper);

        String lower = str.toLowerCase();
        System.out.println("The string in lower case: " + lower);

        System.out.println("===============================================");
    }
}
