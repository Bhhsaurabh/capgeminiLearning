package ArrayProblems;

import java.util.Scanner;

public class ArrayIsPali {

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
		
		
		int i = 0;
		int j = size - 1;
		boolean isArrayP = true;
		while(i < j) {
			if(arr[i++] != arr[j--]) {
				isArrayP = false;
			}
		}
		System.out.println("Array is Palindrome : " + isArrayP);
	}
}
