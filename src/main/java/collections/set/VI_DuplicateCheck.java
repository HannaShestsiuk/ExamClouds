/**
 * 6. Проверка дубликатов логинов
 * Дан массив логинов: ["admin", "qa", "dev", "admin"].
 * Проверь, есть ли дубликаты, используя Set.
 */
package collections.set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VI_DuplicateCheck {
    public static void main(String[] args){
        List<String> logins = Arrays.asList("admin", "qa", "dev", "admin");

        boolean hasDuplicates = hasDuplicates(logins);

        System.out.println("Are there duplicates in the list? " + hasDuplicates);
    }

    public static boolean hasDuplicates(List<String> list){
        // Create a Set from the original list.
        // Duplicates, if exist, are automatically removed.
        Set<String> uniqueValues = new HashSet<>();

        //compare size, if true, than there were duplicates
        return list.size() > uniqueValues.size();
    }
}
