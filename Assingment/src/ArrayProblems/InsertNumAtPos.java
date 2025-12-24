package ArrayProblems;

import java.util.Scanner;

public class InsertNumAtPos {
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
	
		
		System.out.println("Enter position to insert : "); 
		int pos = sc.nextInt();
		if(pos >= size) {
			System.out.print("Enter position under the size");
			pos = sc.nextInt();
		}
		
		arr[pos - 1] = num;
		System.out.println();
		for(int i = 0 ; i < size ; i++) {
				System.out.print(arr[i] + " "); 
			}
			
		}
}
