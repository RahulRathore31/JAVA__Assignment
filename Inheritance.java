package javaAssignment;

class Inheritance {
    public static void main(String[] args) {
        ParentClass parent = new ParentClass();
        ChildClass child = new ChildClass();
        
        parent.printMessage();       
        
        child.printMessage();       
        
        child.printMessage();        
    }
}

    class ParentClass {
    public void printMessage() {
        System.out.println("This is a parent class");
    }
}

    class ChildClass extends ParentClass {
    public void printMessage() {
        System.out.println("This is child class");
    }
}

   