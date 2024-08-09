package javaAssignment;

public class PrintNumberMain {

	public static void main(String[] args) {
		 PrintNumber printer = new PrintNumber();
	        
	        printer.printn(10);         
	        printer.printn(10.5);       
	        printer.printn(10.5f);     
	        printer.printn(10000000000L); 
	        printer.printn((short) 10); 
	        printer.printn((byte) 10);
	}

}
class PrintNumber {

    // Method to print an integer
    public void printn(int number) {
        System.out.println("Integer: " + number);
    }

    // Method to print a double
    public void printn(double number) {
        System.out.println("Double: " + number);
    }

    // Method to print a float
    public void printn(float number) {
        System.out.println("Float: " + number);
    }

    // Method to print a long
    public void printn(long number) {
        System.out.println("Long: " + number);
    }

    // Method to print a short
    public void printn(short number) {
        System.out.println("Short: " + number);
    }

    // Method to print a byte
    public void printn(byte number) {
        System.out.println("Byte: " + number);
    }
}