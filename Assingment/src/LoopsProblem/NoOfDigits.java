package LoopsProblem;

import java.util.Scanner;

public class NoOfDigits {
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		int cnt = 0;
		int rem = 0;
		while(num>0) {
			cnt++;
			num = num/10;
		}
		System.out.print("Sum of Digits of " + org + "  =  " + cnt);
	}
}
