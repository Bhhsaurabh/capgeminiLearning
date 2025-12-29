package LoopsProblem;

import java.util.Scanner;

public class NeonNumber {
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		int sq = num * num;
		int sum = 0;
		while(sq>0) {
			int rem = sq %10;
			sum += rem;
			sq = sq/10;
		}
		System.out.print("Is Neon Number:  " + (sum == num));
	}
}
