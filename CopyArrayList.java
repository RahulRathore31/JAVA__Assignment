package javaAssignment;
import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args) {
        ArrayList<String> originalList = new ArrayList<>();
        
        originalList.add("Red");
        originalList.add("Green");
        originalList.add("Blue");
        originalList.add("Yellow");
        originalList.add("Purple");
        
        ArrayList<String> copiedList = new ArrayList<>(originalList);
        
        System.out.println("Original ArrayList: " + originalList);
        System.out.println("Copied ArrayList: " + copiedList);
    }
}

