package has_a_relationship;

public class Bank {
    private String bankName;
    private Account account;

    Bank(String bankName, Account account) {
        this.bankName = bankName;
        this.account = account;
    }

    public void showAccountDetails() {
        System.out.println("Bank: " + bankName);
        System.out.println("Account No: " + account.getAccountNumber());
        System.out.println("Balance: " + account.getBalance());
    }

    public static void main(String[] args) {
        Account a = new Account(12345, 10000);
        Bank b = new Bank("SBI", a);
        b.showAccountDetails();
    }
}