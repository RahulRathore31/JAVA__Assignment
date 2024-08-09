package javaAssignment;

public class TrianglewithConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Triangle triangle = new Triangle();
	        triangle.printArea();
	        triangle.printPerimeter();
	}

}
    class Triangle {
    private double side1;
    private double side2;
    private double side3;
    
    public Triangle() {
        // Initialize sides with default values for a specific triangle (3, 4, 5)
        this.side1 = 3;
        this.side2 = 4;
        this.side3 = 5;
    }
    
    public void printArea() {
        double semiPerimeter = (side1 + side2 + side3) / 2;
        double area = Math.sqrt(semiPerimeter * (semiPerimeter - side1) * (semiPerimeter - side2) * (semiPerimeter - side3));
        System.out.println("Area: " + area);
    }
    
    public void printPerimeter() {
        double perimeter = side1 + side2 + side3;
        System.out.println("Perimeter: " + perimeter);
    }
 
}
