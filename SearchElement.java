package javaAssignment;
import java.util.ArrayList;
import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the element to search for: ");
        String searchElement = scanner.nextLine();
        
        if (colors.contains(searchElement)) {
            System.out.println(searchElement + " is present in the ArrayList.");
        } else {
            System.out.println(searchElement + " is not present in the ArrayList.");
        }
    }
}
