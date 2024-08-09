package javaAssignment;

public class Abstract {

	public static void main(String[] args) {
		 Parent first = new FirstSubclass();
	        Parent second = new SecondSubclass();
	        
	        first.message();  
	        second.message(); 
	}

}
abstract class Parent {
    abstract void message();
}

class FirstSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the first subclass");
    }
}

class SecondSubclass extends Parent {
    @Override
    void message() {
        System.out.println("This is the second subclass");
    }
}


