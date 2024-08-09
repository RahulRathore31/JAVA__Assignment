package javaAssignment;

public class ShapeArea {
    
    public static void main(String[] args) {
        ShapeArea shape = new ShapeArea();
        shape.printArea(5);        
        shape.printArea(5, 10);   
    }
    
    public void printArea(int side) {
        int area = side * side;
        System.out.println("Area of the square: " + area);
    }
    
    public void printArea(int length, int breadth) {
        int area = length * breadth;
        System.out.println("Area of the rectangle: " + area);
    }
}
