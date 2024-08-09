package javaAssignment;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Comparator;

public class SecondMostFrequentCharacter {
    public static void main(String[] args) {
        String input = "successes";
        System.out.println("The given string is: " + input);
        
        char secondMostFrequentChar = findSecondMostFrequentCharacter(input);
        if (secondMostFrequentChar != '\0') {
            System.out.println("The second most frequent char in the string is: " + secondMostFrequentChar);
        } else {
            System.out.println("Not enough unique characters to determine the second most frequent.");
        }
    }
    
    private static char findSecondMostFrequentCharacter(String str) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char c : str.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        
        PriorityQueue<Map.Entry<Character, Integer>> maxHeap = new PriorityQueue<>(
            new Comparator<Map.Entry<Character, Integer>>() {
                public int compare(Map.Entry<Character, Integer> e1, Map.Entry<Character, Integer> e2) {
                    return e2.getValue().compareTo(e1.getValue());
                }
            }
        );
        
        maxHeap.addAll(frequencyMap.entrySet());
        
        if (maxHeap.size() < 2) {
            return '\0';  
        }
        
        maxHeap.poll();  
        return maxHeap.poll().getKey(); 
    }
}
