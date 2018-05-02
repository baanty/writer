package util;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;
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
    
    /**
     * @param keys Collection of keys
     * @param values String values that need to be checked with the collection
     * @return true if one of the values are in the collection, otherwise false
     */
    public static boolean isIn(List<String> keys, String... values) {
        return Stream.of(values).anyMatch(value -> keys.contains(value));
    }
    
    public static void main(String[] args){
        System.out.println("Current timestamp is - " + getTimeStamp());
    }
    
    public static final String getTimeStamp() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return String.valueOf(localDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
    }
}
