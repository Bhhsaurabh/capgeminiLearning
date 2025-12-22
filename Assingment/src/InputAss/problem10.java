package InputAss;
import java.util.Scanner;

public class problem10 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter num1 : ");
        int num1 = sc.nextInt();

        System.out.println("Enter num2 : ");
        int num2 = sc.nextInt();

        System.out.println("Enter Operation : + (add), - (sub), * (mul), / (div), % (mod)");
        char ch = sc.next().charAt(0);

        switch (ch) {

            case '+':
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
                break;

            case '-':
                System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
                break;

            case '*':
                System.out.println(num1 + " * " + num2 + " = " + (num1 * num2));
                break;

            case '/':
                if (num2 != 0)
                    System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
                else
                    System.out.println("Division by zero is not allowed");
                break;

            case '%':
                if (num2 != 0)
                    System.out.println(num1 + " % " + num2 + " = " + (num1 % num2));
                else
                    System.out.println("Modulo by zero is not allowed");
                break;

            default:
                System.out.println("Invalid Operation");
        }

        sc.close();
    }
}