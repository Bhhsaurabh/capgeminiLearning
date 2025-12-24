package ArrayProblems;

import java.util.Scanner;

public class ReverseDigitsInArray {
	public static int RevNum(int num) {
		int org = num;
		int rev = 0;
		while(org >0) {
			int rem = org % 10;
			rev = rev * 10 + rem;
			org = org / 10;
		}
		return rev;
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
		
		for(int i = 0 ; i < size ; i++) {
			int num = RevNum(arr[i]);
			arr[i] = num;
		}
		System.out.println("This is Array after reversing digit : "); 
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
	}
}
