package javaAssignment;

public class MultipleCatchBlocks {
    public static void main(String[] args) {
        int[] a = new int[5];

        try {
            a[5] = 30 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        }

        System.out.println("Program continues after exception handling.");
    }
}

