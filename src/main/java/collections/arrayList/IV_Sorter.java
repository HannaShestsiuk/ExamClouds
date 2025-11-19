/**
 * 4. Сортировка по алфавиту
 * Создай список email-адресов.
 * Отсортируй их по алфавиту и выведи результат.
 */
package collections.arrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class IV_Sorter {
    public static void main(String[] args) {
        List<String> emailList = new ArrayList<>();
        emailList.add("lion@example.com");
        emailList.add("dog@example.com");
        emailList.add("mouse@example.com");
        emailList.add("cat@example.com");
        emailList.add("fox@example.com");

        Collections.sort(emailList);

        System.out.println("Sorted email list:");
        System.out.println(emailList);
    }
}
