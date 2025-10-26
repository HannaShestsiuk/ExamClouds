/**
 * 8. Список уникальных ошибок
 * Из List<String> ошибок логов создай Set,
 * чтобы оставить только уникальные сообщения об ошибках.
 */
package collections.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class VIII_UniqueExtraction {
    public static void main(String[] args){
        List<String> logs = new ArrayList<>();
        logs.add("Error: Invalid Value");
        logs.add("Error: Empty required field");
        logs.add("Error: Parameter is not found");
        logs.add("Error: Invalid Value");
        logs.add("Error: Unauthorized");

        Set<String> uniqueLogs = new HashSet<>(logs);
        System.out.println("Unique logs:");
        for (String log : uniqueLogs){
            System.out.println("- " + log);
        }
    }
}
