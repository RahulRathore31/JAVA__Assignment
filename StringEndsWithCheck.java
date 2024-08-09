package javaAssignment;

public class StringEndsWithCheck {
    public static void main(String[] args) {
        String mainString1 = "Java Exercises";
        String suffix1 = "se";
        String mainString2 = "Java Exercise";
        String suffix2 = "se";

        boolean endsWithSuffix1 = mainString1.endsWith(suffix1);
        boolean endsWithSuffix2 = mainString2.endsWith(suffix2);

        System.out.println("\"" + mainString1 + "\" ends with \"" + suffix1 + "\"? " + endsWithSuffix1);
        System.out.println("\"" + mainString2 + "\" ends with \"" + suffix2 + "\"? " + endsWithSuffix2);
    }
}
