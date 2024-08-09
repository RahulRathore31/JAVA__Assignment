package javaAssignment;

import java.util.Scanner;

public class DigitCounter {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a positive integer: ");
        int number = scanner.nextInt();
        
        
        if (number <= 0) {
            System.out.println("The number must be a positive integer.");
        } else {
           
            int digitCount = countDigits(number);
           
            System.out.println("The number " + number + " has " + digitCount + " digits.");
        }
        
        
    }
    
    // Method to count the number of digits in a positive integer
    public static int countDigits(int number) {
        int count = 0;
        
        // Count digits by repeatedly dividing by 10
        while (number > 0) {
            number /= 10;
            count++;
        }
        
        return count;
    }
}
