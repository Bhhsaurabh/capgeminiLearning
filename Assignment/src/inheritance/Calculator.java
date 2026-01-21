package inheritance;

class Calculator {
    int add(int a, int b) {
        return a + b;
    }
}

class AdvancedCalculator extends Calculator {
    int multiply(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        AdvancedCalculator ac = new AdvancedCalculator();
        System.out.println(ac.add(10, 20));
        System.out.println(ac.multiply(5, 4));
    }
}