package javaAssignment;

import java.util.ArrayList;
import java.util.Collections;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        
        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Purple");
        
        System.out.println("ArrayList before shuffling: " + colors);
        
        Collections.shuffle(colors);
        
        System.out.println("ArrayList after shuffling: " + colors);
    }
}
