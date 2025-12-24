package ArrayProblems;

import java.util.Scanner;

public class LargestNumInArray {
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
		int lar = Integer.MIN_VALUE;
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] > lar) {
				lar = arr[i];
			}
			
		}
		System.out.print("Larges element in Array : "); 
		System.out.println(lar);
	}
}
