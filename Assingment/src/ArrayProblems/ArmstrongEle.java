package ArrayProblems;

import java.util.Scanner;

public class ArmstrongEle {
	public static boolean isArm(int num) {
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
		return num == sum;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter  the ele: "); 
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("These are Armstrong no in Array : "); 
		for(int i = 0 ; i < size ; i++) {
			if(isArm(arr[i])) {
				System.out.print(arr[i] + " "); 
			}
		}
		
	}
}
