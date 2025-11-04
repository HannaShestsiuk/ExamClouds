/**
 * Изменить регулярное выражение в примере для нахождения строк cab, ccab, cccab.
 * import java.util.regex.Matcher;
 * import java.util.regex.Pattern;
 * public class RegexDemo2 {
 *     public static void main(String[] args) {
 *         Pattern pattern = Pattern.compile("a*b");
 *         Matcher matcher = pattern.matcher("aaab");
 *         boolean b = matcher.matches();
 *         System.out.println(b);
 *     }
 * }
 */
package lesson14_strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class VII_RegEx {
    public static void main(String[] args) {
        Pattern pattern = Pattern.compile("c+ab");
        String[] testStrings = {"cab", "ccab", "cccab", "aaab"};

        for (String str : testStrings) {
            Matcher matcher = pattern.matcher(str);
            boolean matches = matcher.matches();
            System.out.println(str + " -> " + matches);
        }
    }
}
