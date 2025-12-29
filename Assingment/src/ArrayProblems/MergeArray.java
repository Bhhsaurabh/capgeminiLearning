package ArrayProblems;

import java.util.Scanner;

public class MergeArray {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size of Array: ");
		int size = sc.nextInt();
		
		int[] arr = new int[size];
		int[] arr2 = new int[size];
		int[] arr3 = new int[size * 2];
		for(int i = 0 ; i < size ; i++) {
			System.out.print("Enter the ele for 1st Array: "); 
			arr[i] = sc.nextInt();
		}
		System.out.println();
		System.out.print("Enter the ele for 2nd Array: "); 
		for(int i = 0 ; i < size ; i++) {
			arr2[i] = sc.nextInt();
		}
		System.out.println();

		for(int i = 0 ; i < size ; i++) {
			arr3[i] = arr[i];
			arr3[size + i] = arr2[i];
		}
		System.out.println("Merged Array: ");
		
		for(int i = 0 ; i < size * 2 ; i++) {
			System.out.print(arr3[i] + " ");
		}
	}
}
