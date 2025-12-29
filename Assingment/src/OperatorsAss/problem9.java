package OperatorsAss;

public class problem9 {
    public static void main(String[] args) {

        int unitCon = 500;
        int perUnit = 10;
        boolean isCom = false;
        double comTax = 0.30;
        double nTax = 0.10;
        double totalAmount = unitCon * perUnit;

        boolean applyTax = unitCon > 300;

        totalAmount = isCom
                ? totalAmount + (totalAmount * comTax)
                : applyTax
                    ? totalAmount + (totalAmount * nTax)
                    : totalAmount;

        System.out.println("Total Amount : " + totalAmount);
    }
}