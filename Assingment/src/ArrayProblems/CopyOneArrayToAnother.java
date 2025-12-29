package ArrayProblems;

import java.util.Scanner;

public class CopyOneArrayToAnother {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int[] arr2 = new int[size];
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter  the ele: "); 
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.println("Copying One Array Ele To Another : "); 
		for(int i = 0 ; i < size ; i++) {
			arr2[i] = arr[i];
		}
		System.out.println();
		System.out.println("First Array: ");
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println("Second Array: ");
		for(int i = 0 ; i < size ; i++) {
			System.out.print(arr2[i] + " ");
		}
	}
}
