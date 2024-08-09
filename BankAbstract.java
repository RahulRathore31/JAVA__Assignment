package javaAssignment;

public class BankAbstract {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bank bankA = new BankA();
        Bank bankB = new BankB();
        Bank bankC = new BankC();
        
        System.out.println("Balance in Bank A: $" + bankA.getBalance());
        System.out.println("Balance in Bank B: $" + bankB.getBalance());
        System.out.println("Balance in Bank C: $" + bankC.getBalance());
	}

}
abstract class Bank {
    abstract double getBalance();
}

class BankA extends Bank {
    @Override
    double getBalance() {
        return 100.0;
    }
}

class BankB extends Bank {
    @Override
    double getBalance() {
        return 150.0;
    }
}

class BankC extends Bank {
    @Override
    double getBalance() {
        return 200.0;
    }
}


