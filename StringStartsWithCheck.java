package javaAssignment;

public class StringStartsWithCheck {
    public static void main(String[] args) {
        String mainString1 = "Red is favorite color.";
        String prefix1 = "Red";
        String mainString2 = "Orange is also my favorite color.";
        String prefix2 = "Red";

        boolean startsWithPrefix1 = mainString1.startsWith(prefix1);
        boolean startsWithPrefix2 = mainString2.startsWith(prefix2);

        System.out.println("\"" + mainString1 + "\" starts with \"" + prefix1 + "\"? " + startsWithPrefix1);
        System.out.println("\"" + mainString2 + "\" starts with \"" + prefix2 + "\"? " + startsWithPrefix2);
    }
}
