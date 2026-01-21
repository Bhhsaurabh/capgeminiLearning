package polymorphism;

abstract class Payment {
    abstract void pay(double amount);
}

class CreditCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Credit Card");
    }
}

class DebitCardPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using Debit Card");
    }
}

class UPIPayment extends Payment {
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }
}

class PaymentApp {
    public static void main(String[] args) {
        Payment p;

        p = new CreditCardPayment();
        p.pay(5000);

        p = new DebitCardPayment();
        p.pay(3000);

        p = new UPIPayment();
        p.pay(1500);
    }
}