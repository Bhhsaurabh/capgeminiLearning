package polymorphism;

class Customer {
    double calculateDiscount(double amount) {
        return 0;
    }
}

class RegularCustomer extends Customer {
    double calculateDiscount(double amount) {
        return amount * 0.05;
    }
}

class PremiumCustomer extends Customer {
    double calculateDiscount(double amount) {
        return amount * 0.10;
    }
}

class VIPCustomer extends Customer {
    double calculateDiscount(double amount) {
        return amount * 0.20;
    }
}

class DiscountSystem {
    public static void main(String[] args) {
        Customer c;

        c = new RegularCustomer();
        System.out.println("Regular Discount: " + c.calculateDiscount(5000));

        c = new PremiumCustomer();
        System.out.println("Premium Discount: " + c.calculateDiscount(5000));

        c = new VIPCustomer();
        System.out.println("VIP Discount: " + c.calculateDiscount(5000));
    }
}