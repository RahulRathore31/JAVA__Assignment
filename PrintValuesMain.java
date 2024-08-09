package javaAssignment;

public class PrintValuesMain {

	public static void main(String[] args) {
		 PrintValues printer = new PrintValues();
	        
	        printer.printValue(10, 'A');  
	        printer.printValue('B', 20); 

	}

}
    class PrintValues {

    public void printValue(int n, char c) {
        System.out.println("Integer: " + n + ", Character: " + c);
    }

    public void printValue(char c, int n) {
        System.out.println("Character: " + c + ", Integer: " + n);
    }

}
