package abstraction;

public abstract class BankAccount {

    protected double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public abstract double calculateInterest();

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        }
    }

    public void showBalance() {
        System.out.println("Balance: " + balance);
    }
    public static void main(String[] args) {
    	BankAccount acc = new SavingsAccount(10000);
    	acc.deposit(2000);
    	acc.withdraw(3000);
    	System.out.println("Interest: " + acc.calculateInterest());
    	acc.showBalance();
	}
}