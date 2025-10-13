package lesson19_collections.IV_UnionAndIntersect;

import java.util.HashSet;
import java.util.Set;

public class UnionSet {
    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        // Create a new set
        Set<T> result = new HashSet<>(set1);
        // Add all elements from the second set => only unique elements
        result.addAll(set2);
        return result;
    }
}
