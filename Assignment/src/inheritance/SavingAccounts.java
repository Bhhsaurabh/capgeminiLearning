package inheritance;

class Account {
    int accountNo;

    Account(int accountNo) {
        this.accountNo = accountNo;
    }
}

class SavingsAccount extends Account {
    double interestRate;

    SavingsAccount(int accountNo, double interestRate) {
        super(accountNo);
        this.interestRate = interestRate;
    }

    void show() {
        System.out.println(accountNo + " " + interestRate);
    }

    public static void main(String[] args) {
        SavingsAccount s = new SavingsAccount(12345, 4.5);
        s.show();
    }
}