package javaAssignment;

public class PalindromeOrNot {
    public static void main(String[] args) {
        String str = "Palindrome";
        String reversed = reverseString(str);
        boolean isPalindrome = str.equals(reversed);
        System.out.println("Reversed string: " + reversed);
        System.out.println("Is palindrome: " + isPalindrome);
    }
    
    public static String reverseString(String str) {
        String reversed = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
        }
        return reversed;
    }
}
