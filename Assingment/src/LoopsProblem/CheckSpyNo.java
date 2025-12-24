package LoopsProblem;

import java.util.Scanner;

public class CheckSpyNo {
	// sum == pro
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		long sum = 0;
		long pro = 1;
		int rem = 0;
		while(num>0) {
			rem = num % 10;
			pro *= rem;
			sum += rem;
			num = num/10;
		}
		System.out.print("Is Spy Num: " + org + " : " + (sum == pro));
	}
}
