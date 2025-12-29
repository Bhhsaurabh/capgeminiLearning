package ArrayProblems;

import java.util.Scanner;

public class OddELe {
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
		System.out.println("Odd Elements in Array : "); 
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] % 2 != 0) {
				System.out.print(arr[i] + " "); 
			}
			
		}
	}
}
