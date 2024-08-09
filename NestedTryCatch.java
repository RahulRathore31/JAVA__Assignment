package javaAssignment;


public class NestedTryCatch {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            try {
                a[5] = 30 / 0; 
            } catch (ArithmeticException e) {
                System.out.println("Inner Catch: Error - Division by zero is not allowed.");
            }

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer Catch: Error - Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Outer Catch: General exception.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
