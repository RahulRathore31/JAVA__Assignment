package javaAssignment;

import java.util.Scanner;

public class AgeValidator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        
        try {
            validate(age);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: not valid");
        }
        
        scanner.close();
    }

    private static void validate(int age) {
        if (age < 18) {
            throw new ArithmeticException("not valid");
        } else {
            System.out.println("Welcome to vote.");
        }
    }
}
