package LoopsProblem;
import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Num: ");
		int num = sc.nextInt();

		int temp = num;
		int sum = 0;

		while (temp > 0) {
			int rem = temp % 10;
			sum += rem * rem * rem;
			temp = temp / 10;
		}

		System.out.println("Armstrong Number: " + (sum == num));
		sc.close();
	}
}