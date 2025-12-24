package LoopsProblem;
import java.util.Scanner;
public class SumOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		int sum = 0;
		int rem = 0;
		while(num>0) {
			rem = num % 10;
			sum += rem;
			num = num/10;
		}
		System.out.print("Sum of Digits of " + org + "  =  " + sum);
	}
}
