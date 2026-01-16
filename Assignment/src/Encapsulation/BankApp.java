package Encapsulation;

public class BankApp {
	public static void main(String[] args) {
		Bank b1 = new Bank("1023921232" , 4000L);
		b1.getBalance();
		b1.deposit(200L);
		b1.getBalance();
		b1.withdraw(400);
		b1.getBalance();
	}
}
