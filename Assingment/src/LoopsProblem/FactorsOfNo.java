package LoopsProblem;
import java.util.Scanner;

public class FactorsOfNo {
	public static void main(String[] args) {
		System.out.print("Enter your Num:  ");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();

		for (int i = 1; i * i <= num; i++) {
			if (num % i == 0) {
				System.out.print(i + " ");
				
				if(i != num/i) {
					System.out.print(num/i + " ");
				}
			}
		}

		
		sc.close();
	}
}