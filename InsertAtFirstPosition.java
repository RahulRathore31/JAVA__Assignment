package javaAssignment;
import java.util.ArrayList;

public class InsertAtFirstPosition {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
       
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        
        
        System.out.println("ArrayList before insertion: " + colors);
        
        
        colors.add(0, "Yellow");
        
        System.out.println("ArrayList after inserting 'Yellow' at the first position: " + colors);
    }
}

