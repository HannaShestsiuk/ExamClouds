/**
 * 1. Напишите методы
 *      - static <T> Set<T> union(Set<T> set1, Set<T> set2) и
 *      - static <T> Set<T> intersect(Set<T> set1, Set<T> set2),
 *  реализующих операции объединения и пересечения множеств.
 * 2. Протестируйте работу этих методов на предварительно заполненных множествах.
 */
package lesson19_collections.IV_UnionAndIntersect;

import java.util.HashSet;
import java.util.Set;

import static lesson19_collections.IV_UnionAndIntersect.IntersectSet.intersect;
import static lesson19_collections.IV_UnionAndIntersect.UnionSet.union;

public class Main {
    public static void main(String[] args) {
        Set<Integer> firstSet = new HashSet<Integer>();
        Set<Integer> secondSet = new HashSet<Integer>();

        firstSet.add(1);
        firstSet.add(2);
        firstSet.add(3);
        firstSet.add(4);
        System.out.println("The First Set: " + firstSet);

        secondSet.add(3);
        secondSet.add(4);
        secondSet.add(5);
        secondSet.add(6);
        System.out.println("The Second Set: " + secondSet);

        Set<Integer> unionSet = union(firstSet, secondSet);
        System.out.println("\nUnion Set: " + unionSet);

        Set<Integer> intersectSet = intersect(firstSet, secondSet);
        System.out.println("\nIntersect Set: " + intersectSet);
    }
}
