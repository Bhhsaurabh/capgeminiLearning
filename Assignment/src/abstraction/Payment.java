package abstraction;

public abstract class Payment {
    private double totalAmount;

    Payment(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    // controlled access
    protected double getTotalAmount() {
        return totalAmount;
    }

    protected void addAmount(double amount) {
        if (amount > 0) {
            totalAmount += amount;
        }
    }

    protected void deductAmount(double amount) {
        if (amount > 0 && amount <= totalAmount) {
            totalAmount -= amount;
        }
    }

    public abstract void processPayment(double amount);

    public void printReceipt() {
        System.out.println("Payment Done. Final Amount: " + totalAmount);
    }
    
    public static void main(String[] args) {
		Payment p1 = new CreditCardPayment(20000);
		p1.processPayment(5000);
	}
}