package LoopsProblem;

import java.util.Scanner;

public class CheckPrime {
	public static void main(String[] args) {
		System.out.println("Enter you Num: ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		boolean isP = true;
		for(int i = 2 ; i * i <= num ; i++) {
			if(num % i == 0) {
				isP = false;
				break;
			}
		}
		System.out.println(isP);
	}
}
