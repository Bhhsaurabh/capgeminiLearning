package ArrayProblems;

import java.util.Scanner;

public class SecondLarEleInArray {
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
		int sec = lar;
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] > lar) {
				sec = lar;
				lar = arr[i];
			}else if(arr[i] > sec && arr[i] != lar) {
				sec = arr[i];
			}
			
		}
		System.out.print("Second Larges element in Array : "); 
		System.out.println(sec);
	}
}
