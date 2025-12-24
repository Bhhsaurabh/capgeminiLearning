package ArrayProblems;

import java.util.Scanner;

public class InsertEle {
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
		System.out.println("Enter no to insert : "); 
		int num = sc.nextInt();
	
		
		System.out.println("Enter index to insert : "); 
		int idx = sc.nextInt();
		if(idx >= size) {
			System.out.print("Enter index under the size");
			idx = sc.nextInt();
		}
		
		arr[idx] = num;
		System.out.println();
		for(int i = 0 ; i < size ; i++) {
				System.out.print(arr[i] + " "); 
			}
			
		}
}
