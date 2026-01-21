package inheritance;

class Bank {
    double getInterestRate() {
        return 5.0;
    }
}

class SBI extends Bank {
    @Override
    double getInterestRate() {
        return 6.5;
    }
}

class HDFC extends Bank {
    @Override
    double getInterestRate() {
        return 7.0;
    }

    public static void main(String[] args) {
        Bank b = new HDFC();
        System.out.println(b.getInterestRate());
    }
}