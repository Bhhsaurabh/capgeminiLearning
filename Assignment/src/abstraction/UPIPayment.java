package abstraction;

public class UPIPayment extends Payment{
	
	UPIPayment(double totalAmount){
		super(totalAmount);
	}

	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Method: Upi");
		deductAmount(amount);
		printReceipt();
	}

}
