package javaAssignment;

public class StringLength {
    public static void main(String[] args) {
        String str = "Hello, World!";
        int length = findLength(str);
        System.out.println("The length of the string is: " + length);
    }
    
    public static int findLength(String str) {
        int length = 0;
        try {
            char[] chars = str.toCharArray();
            for (char c : chars) {
                length++;
            }
        } catch (Exception e) {
            // Handle any potential exceptions (e.g., null input)
        }
        return length;
    }
}
