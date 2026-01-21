package polymorphism;

class MenuItem {
    double calculatePrice() {
        return 0;
    }
}

class VegItem extends MenuItem {
    double calculatePrice() {
        return 250;
    }
}

class NonVegItem extends MenuItem {
    double calculatePrice() {
        return 400;
    }
}

class RestaurantBilling {
    public static void main(String[] args) {
        MenuItem item;

        item = new VegItem();
        System.out.println("Veg Item Price: " + item.calculatePrice());

        item = new NonVegItem();
        System.out.println("Non-Veg Item Price: " + item.calculatePrice());
    }
}