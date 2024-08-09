package javaAssignment;
import java.util.Scanner;
public class InsufficientBalanceExceptionMain {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
	        BankAccount account = new BankAccount(2000.00);

	        System.out.println("Account balance is: " + account.getBalance());
	        System.out.print("Enter withdraw amount: ");
	        double amount = scanner.nextDouble();

	        try {
	            account.withdraw(amount);
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	}

}
    class InsufficientBalanceException extends Exception {
    public InsufficientBalanceException(String message) {
        super(message);
    }
}


   class BankAccount {
    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException {
        if (amount > balance) {
            double shortfall = amount - balance;
            throw new InsufficientBalanceException("Sorry, insufficient balance, you need more " + shortfall + " Rs. to perform this transaction.");
        }
        balance -= amount;
        System.out.println("Withdrawal successful. Remaining balance: " + balance);
    }

    public double getBalance() {
        return balance;
    }

}
