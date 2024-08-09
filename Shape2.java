package javaAssignment;

public class Shape2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Area area = new Area();
	        
	        
	        double length = 5.0;
	        double breadth = 3.0;
	        double side = 4.0;
	        double radius = 2.0;
	        
	        area.RectangleArea(length, breadth);
	        area.SquareArea(side);
	        area.CircleArea(radius);
	}

}
abstract class Shape {
    abstract void RectangleArea(double length, double breadth);
    abstract void SquareArea(double side);
    abstract void CircleArea(double radius);
}

class Area extends Shape {
    @Override
    void RectangleArea(double length, double breadth) {
        double area = length * breadth;
        System.out.println("Area of Rectangle: " + area);
    }
    
    @Override
    void SquareArea(double side) {
        double area = side * side;
        System.out.println("Area of Square: " + area);
    }
    
    @Override
    void CircleArea(double radius) {
        double area = Math.PI * radius * radius;
        System.out.println("Area of Circle: " + area);
    }
}
