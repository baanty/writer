package util;

import java.util.Set;
import java.util.stream.Stream;

public class Utility {

    /**
     * @param keys Collection of keys
     * @param values String values that need to be checked with the collection
     * @return true if one of the values are in the collection, otherwise false
     */
    public static boolean isIn(Set<String> keys, String... values) {
        return Stream.of(values).anyMatch(value -> keys.contains(value));
    }
}
