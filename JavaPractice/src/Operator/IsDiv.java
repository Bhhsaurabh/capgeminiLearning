package Operator;

public class IsDiv {
    public static void main(String[] args) {
        int num = 15;

        boolean isFive = (num % 5) == 0;
        boolean isThree = (num % 3) == 0;

        String result = isFive && isThree ? "3 and 5"
                        : isFive ? "5"
                        : isThree ? "3"
                        : "neither 3 nor 5";

        System.out.println(num + " is divisible by: " + result);
    }
}