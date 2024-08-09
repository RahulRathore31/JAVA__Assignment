package javaAssignment;
import java.util.ArrayList;

public class RemoveThirdElement {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("ArrayList before removal: " + colors);
        
        if (colors.size() >= 3) {
            colors.remove(2);
        }
        
        System.out.println("ArrayList after removal: " + colors);
    }
}
