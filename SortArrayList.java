package javaAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("ArrayList before sorting: " + colors);
        
        Collections.sort(colors);
        
        System.out.println("ArrayList after sorting: " + colors);
    }
}

