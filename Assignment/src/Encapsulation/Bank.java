package Encapsulation;

public class Bank {
	private String acNo;
	private long balance;
	
	Bank(){
		
	}
	Bank(String acNo , long balance){
		this.acNo = acNo;
		this.balance = balance;
	}
	
	public void deposit(long amount) {
		if(amount > 0) {
			balance += amount;
		}else {
			System.out.println("Enter valid amount!");
		}
	}
	
	public void withdraw(long amount) {
		if(amount > balance) {
			System.out.println("Your Balance is Less : " + balance);
		}
		else {
			balance -= amount;
		}
	}
	public void getBalance() {
		System.out.println("Your remaining balance is : " + balance);
	}
	
}
