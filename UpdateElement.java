package javaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class UpdateElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("ArrayList before update: " + colors);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index of the element to update: ");
        int index = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        
        if (index >= 0 && index < colors.size()) {
            System.out.print("Enter the new value: ");
            String newValue = scanner.nextLine();
            colors.set(index, newValue);
            System.out.println("ArrayList after update: " + colors);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}

