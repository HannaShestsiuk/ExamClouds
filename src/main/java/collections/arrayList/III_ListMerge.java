/**
 * 3. Объединение списков
 * Даны два списка с элементами:
 * [QA, DEV, PM] и [UX, DEVOPS].
 * Объедини их в один список без дубликатов.
 */
package collections.arrayList;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class III_ListMerge {
    public static void main(String[] args) {
        List<String> list1 = Arrays.asList("QA", "DEV", "PM");
        List<String> list2 = Arrays.asList("UX", "DEVOPS", "PM");

        mergeLists(list1, list2);
    }

    static void mergeLists(List<String> list1, List<String> list2){
        //Create hashSet storing unique items;
        HashSet<String> mergedListWithoutDups = new HashSet<>();

        mergedListWithoutDups.addAll(list1);
        mergedListWithoutDups.addAll(list2);

        System.out.println("List of elements without duplicates:");
        System.out.println(mergedListWithoutDups);
    }
}
