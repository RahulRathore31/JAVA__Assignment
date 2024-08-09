package javaAssignment;
public class StringComparison {
    public static void main(String[] args) {
        String originalString1 = "topsint.com";
        String comparisonString1 = "topsint.com";
        String originalString2 = "Topsint.com";
        String comparisonString2 = "topsint.com";
        
        boolean result1 = originalString1.equals(comparisonString1);
        boolean result2 = originalString2.equalsIgnoreCase(comparisonString2);

        System.out.println("Comparing \"" + originalString1 + "\" and \"" + comparisonString1 + "\": " + result1);
        System.out.println("Comparing \"" + originalString2 + "\" and \"" + comparisonString2 + "\": " + result2);
    }
}

