package lesson19_collections.IV_UnionAndIntersect;

import java.util.HashSet;
import java.util.Set;

public class IntersectSet {
    public static <T> Set<T> intersect (Set<T> set1, Set<T> set2) {
        //Create a new set
        Set<T> result = new HashSet<>(set1);
        // retain common elements from set2
        result.retainAll(set2);
        return result;
    }
}
