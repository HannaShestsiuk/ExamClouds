/**
 * Составляем строку с помощью класса StringBuilder
 * 1. Дано два числа, например 3 и 56, необходимо составить следующие строки:
 *      3 + 56 = 59
 *      3 – 56 = -53
 *      3 * 56 = 168.
 * 2. Используем метод StringBuilder.append().
 * 3. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
 */
package lesson14_strings;

public class II_stringBuilder {
    public static void main(String[] args) {
        int a = 3;
        int b = 56;

        StringBuilder sbSum = createStringWithSum(a,b);
        System.out.println(sbSum);
        StringBuilder sbSubtract = createStringWithSubtract(a,b);
        System.out.println(sbSubtract);
        StringBuilder sbMultiplication = createStringWithMultiplication(a,b);
        System.out.println(sbMultiplication);

        replaceEqualsChar(sbSum);
        replaceEqualsChar(sbSubtract);
        replaceEqualsChar(sbMultiplication);
    }

    private static StringBuilder createStringWithSum(int a, int b){
        StringBuilder string = new StringBuilder();
        string.append(a).append(" + ").append(b).append(" = ").append(a + b);
        return string;
    }

    private static StringBuilder createStringWithSubtract(int a, int b){
        StringBuilder string = new StringBuilder();
        string.append(a).append(" - ").append(b).append(" = ").append(a - b);
        return string;
    }

    private static StringBuilder createStringWithMultiplication(int a, int b){
        StringBuilder string = new StringBuilder();
        string.append(a).append(" * ").append(b).append(" = ").append(a * b);
        return string;
    }

    private static void replaceEqualsChar(StringBuilder stringBuilder){
        stringBuilder.replace(stringBuilder.indexOf("="), stringBuilder.indexOf("=") + 1, "равно");
        System.out.println(stringBuilder);;
    }
}
