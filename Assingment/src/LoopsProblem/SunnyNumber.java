package LoopsProblem;

import java.util.Scanner;

public class SunnyNumber {
	public static long printFac(int num) {
		long fact = 1;
		for(int i = 1 ; i <= num ; i++) {
			fact *= i;
		}
		return fact;
	}
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		int rem = 0;
		long sum = 0;
		while(num>0) {
			sum += printFac(num % 10);
			num = num/10;
		}
		System.out.println("Is sunny No: " + (sum == org));
	}
}
