package ArrayProblems;

import java.util.Scanner;

public class FirstAndLast {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter  the ele: "); 
			arr[i] = sc.nextInt();
		}
		System.out.println("First Ele :"  + arr[0]);
		System.out.println("Last Ele : " + arr[size - 1]);
		
	}
}
