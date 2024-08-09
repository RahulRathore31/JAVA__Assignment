package javaAssignment;

import java.util.HashSet;
import java.util.Set;

public class StringInterleaving {
    public static void main(String[] args) {
        String str1 = "WX";
        String str2 = "YZ";
        
        Set<String> result = new HashSet<>();
        generateInterleavings(str1, str2, "", result);
        
        System.out.println("The interleaving strings are: " + result);
    }
    
    private static void generateInterleavings(String str1, String str2, String current, Set<String> result) {
        if (str1.isEmpty() && str2.isEmpty()) {
            result.add(current);
            return;
        }
        
        if (!str1.isEmpty()) {
            generateInterleavings(str1.substring(1), str2, current + str1.charAt(0), result);
        }
        
        if (!str2.isEmpty()) {
            generateInterleavings(str1, str2.substring(1), current + str2.charAt(0), result);
        }
    }
}
