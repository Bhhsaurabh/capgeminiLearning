package LoopsProblem;

import java.util.Scanner;

public class FactOfEachDig {
	public static void printFac(int num) {
		long fact = 1;
		for(int i = 1 ; i <= num ; i++) {
			fact *= i;
		}
		System.out.print(fact);
	}
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int org = num;
		int rem = 0;
		while(num>0) {
			System.out.print(num%10+ " -  ");
			printFac(num % 10);
			System.out.println();
			num = num/10;
		}
	}
}
