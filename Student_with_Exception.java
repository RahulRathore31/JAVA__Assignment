package javaAssignment;

public class Student_with_Exception {

	public static void main(String[] args) {
		try {
            Student student = new Student(1, "John Doe", 22, "Computer Science");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }

        try {
            Student student = new Student(2, "Jane123", 20, "Mathematics");
        } catch (AgeNotWithinRangeException | NameNotValidException e) {
            System.out.println(e.getMessage());
        }
	}

}
    class AgeNotWithinRangeException extends Exception {
    public AgeNotWithinRangeException(String message) {
        super(message);
    }
}
    class NameNotValidException extends Exception {
    public NameNotValidException(String message) {
        super(message);
    }
}
    class Student {
    private int rollNo;
    private String name;
    private int age;
    private String course;

    public Student(int rollNo, String name, int age, String course) throws AgeNotWithinRangeException, NameNotValidException {
        this.rollNo = rollNo;
        this.name = name;
        this.age = age;
        this.course = course;

        if (age < 15 || age > 21) {
            throw new AgeNotWithinRangeException("Age must be between 15 and 21.");
        }

        if (!name.matches("[a-zA-Z ]+")) {
            throw new NameNotValidException("Name contains invalid characters. Only alphabets and spaces are allowed.");
        }
    }

   
}
