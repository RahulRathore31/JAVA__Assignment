package javaAssignment;

public class Rectangle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle1 rectangle = new Rectangle1(5.0, 3.0);
        Square square = new Square(4.0);
        
        System.out.println("Rectangle:");
        rectangle.printArea();
        rectangle.printPerimeter();
        
        System.out.println("Square:");
        square.printArea();
        square.printPerimeter();
	}

}
    class Rectangle1 {
    double length;
    double breadth;
    
    public Rectangle1(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    
    public void printArea() {
        double area = length * breadth;
        System.out.println("Area: " + area);
    }
    
    public void printPerimeter() {
        double perimeter = 2 * (length + breadth);
        System.out.println("Perimeter: " + perimeter);
    }
}

    class Square extends Rectangle1 {
    public Square(double side) {
        super(side, side);
    }
}

