package LoopsProblem;

import java.util.Scanner;

public class FactorsOfAllDIgits {
// 123 - 3 -fac , 2 fac ,1 fac
	public static void printFac(int num) {
		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				
				if(i != num/i) {
					System.out.print(num/i + " ");
				}
			}
		}
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
