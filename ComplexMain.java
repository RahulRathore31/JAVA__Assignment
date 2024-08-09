package javaAssignment;
import java.util.Scanner;

public class ComplexMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

        System.out.print("Enter real part of first complex number: ");
        double real1 = scanner.nextDouble();
        System.out.print("Enter imaginary part of first complex number: ");
        double imaginary1 = scanner.nextDouble();
        
        System.out.print("Enter real part of second complex number: ");
        double real2 = scanner.nextDouble();
        System.out.print("Enter imaginary part of second complex number: ");
        double imaginary2 = scanner.nextDouble();

        Complex num1 = new Complex(real1, imaginary1);
        Complex num2 = new Complex(real2, imaginary2);

        num1.printSum(num2);
        num1.printDifference(num2);
        num1.printProduct(num2);
	}

}

class Complex {
    private double real;
    private double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void printSum(Complex other) {
        double realSum = this.real + other.real;
        double imaginarySum = this.imaginary + other.imaginary;
        System.out.println("Sum: " + realSum + " + " + imaginarySum + "i");
    }

    public void printDifference(Complex other) {
        double realDiff = this.real - other.real;
        double imaginaryDiff = this.imaginary - other.imaginary;
        System.out.println("Difference: " + realDiff + " + " + imaginaryDiff + "i");
    }

    public void printProduct(Complex other) {
        double realProd = (this.real * other.real) - (this.imaginary * other.imaginary);
        double imaginaryProd = (this.real * other.imaginary) + (this.imaginary * other.real);
        System.out.println("Product: " + realProd + " + " + imaginaryProd + "i");
    }

  
}
