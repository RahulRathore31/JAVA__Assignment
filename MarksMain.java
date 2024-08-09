package javaAssignment;

public class MarksMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		    A studentA = new A(85, 90, 78);
	        B studentB = new B(88, 76, 92, 81);
	        
	        System.out.println("Percentage of student A: " + studentA.getPercentage() + "%");
	        System.out.println("Percentage of student B: " + studentB.getPercentage() + "%");
	}

}
abstract class Marks {
    abstract double getPercentage();
}

class A extends Marks {
    private double mark1;
    private double mark2;
    private double mark3;
    
    public A(double mark1, double mark2, double mark3) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
    }
    
    @Override
    double getPercentage() {
        double totalMarks = mark1 + mark2 + mark3;
        return (totalMarks / 300) * 100;
    }
}

class B extends Marks {
    private double mark1;
    private double mark2;
    private double mark3;
    private double mark4;
    
    public B(double mark1, double mark2, double mark3, double mark4) {
        this.mark1 = mark1;
        this.mark2 = mark2;
        this.mark3 = mark3;
        this.mark4 = mark4;
    }
    
    @Override
    double getPercentage() {
        double totalMarks = mark1 + mark2 + mark3 + mark4;
        return (totalMarks / 400) * 100;
    }
}
