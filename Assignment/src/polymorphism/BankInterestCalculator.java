package polymorphism;

class BankAccount {
    double calculateInterest(double amount) {
        return 0;
    }
}

class SavingsAccount extends BankAccount {
    double calculateInterest(double amount) {
        return amount * 0.04;
    }
}

class FixedDepositAccount extends BankAccount {
    double calculateInterest(double amount) {
        return amount * 0.07;
    }
}

class CurrentAccount extends BankAccount {
    double calculateInterest(double amount) {
        return amount * 0.02;
    }
}

class BankInterestCalculator {
    public static void main(String[] args) {
        BankAccount b;

        b = new SavingsAccount();
        System.out.println("Savings Interest: " + b.calculateInterest(10000));

        b = new FixedDepositAccount();
        System.out.println("FD Interest: " + b.calculateInterest(10000));

        b = new CurrentAccount();
        System.out.println("Current Interest: " + b.calculateInterest(10000));
    }
}