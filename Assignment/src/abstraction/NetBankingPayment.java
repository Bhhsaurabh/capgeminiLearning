package abstraction;

public class NetBankingPayment extends Payment{
	
	NetBankingPayment(double totalAmount){
		super(totalAmount);
	}
	@Override
	public void processPayment(double amount) {
		// TODO Auto-generated method stub
		System.out.println("Payment Method: NetBanking");
		deductAmount(amount);
		printReceipt();
	}

}
