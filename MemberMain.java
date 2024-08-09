package javaAssignment;


   class Member {
    String name;
    int age;
    String phoneNumber;
    String address;
    double salary;
    
    public void printSalary() {
        System.out.println("Salary: " + salary);
    }

    public static void MemberMain(String[] args) {
        Member member = new Member();
        member.name = "RahulRathore";
        member.age = 24;
        member.phoneNumber = "123-456-7890";
        member.address = "Uvarsad,Gandhinagar";
        member.salary = 50000.00;
        
        member.printSalary();
    }
}
