package javaAssignment;

public class CharacterAtIndex {
    public static void main(String[] args) {
        String originalString = "Tops Technologies!";
        
        int[] indices = {0, 10};
        
        for (int index : indices) {
            if (index >= 0 && index < originalString.length()) {
                char character = originalString.charAt(index);
                System.out.println("The character at position " + index + " is " + character);
            } else {
                System.out.println("Index " + index + " is out of bounds");
            }
        }
    }
}

