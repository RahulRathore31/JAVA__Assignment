package javaAssignment;

public class FactorialCalculator {
    
    public static void main(String[] args) {
        int number = 5; // You can change this value to test other numbers
        int result = Factorial(number);
        System.out.println(number + "! = " + result);
    }
    
    public static int Factorial(int n) {
        if (n < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
            return -1;
        }
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}
