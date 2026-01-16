package abstraction;

public class CreditCardPayment extends Payment{

	CreditCardPayment(double totalAmount){
		super(totalAmount);
	}
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Method: Credit Card");
		deductAmount(amount);
		printReceipt();
	}

}
