package javaAssignment;

public class DivisionWithCommandLineArgs {
    public static void main(String[] args) {
        if (args.length < 2) {
            System.out.println("Please provide two numbers as command line arguments.");
            return;
        }

        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);
            int result = numerator / denominator;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception in thread main java.lang.ArithmeticException: / by zero");
        } catch (NumberFormatException e) {
            System.out.println("Please provide valid integers.");
        }

        System.out.println("Program continues after exception handling.");
    }
}
