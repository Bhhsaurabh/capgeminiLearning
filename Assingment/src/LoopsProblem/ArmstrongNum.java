package LoopsProblem;
import java.util.Scanner;

public class ArmstrongNum {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your Num: ");
		int num = sc.nextInt();
		int cnt = 0;
		int temp = num;
		int temp2 = num;
		int sum = 0;

		while (temp > 0) {
			cnt++;
			temp = temp / 10;
		}
		while (temp2 > 0) {
			int rem = temp2 % 10;
			sum += (int)Math.pow(rem , cnt);
			temp2 = temp2 / 10;
		}
		
		

		System.out.println("Armstrong Number: " + (sum == num));
		sc.close();
	}
}