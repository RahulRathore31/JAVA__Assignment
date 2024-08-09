package javaAssignment;

import java.util.ArrayList;
import java.util.Scanner;

public class RetrieveElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("ArrayList: " + colors);
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the index of the element to retrieve: ");
        int index = scanner.nextInt();
        
        if (index >= 0 && index < colors.size()) {
            String element = colors.get(index);
            System.out.println("Element at index " + index + " is: " + element);
        } else {
            System.out.println("Index " + index + " is out of bounds.");
        }
    }
}

