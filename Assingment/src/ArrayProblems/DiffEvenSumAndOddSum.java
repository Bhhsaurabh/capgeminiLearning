package ArrayProblems;

import java.util.Scanner;

public class DiffEvenSumAndOddSum {
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
		int evenSum = 0;
		int oddSum = 0;
		System.out.println("Diff of even sum and odd sum : "); 
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] % 2 == 0) {
				evenSum += arr[i];
			}else {
				
				oddSum += arr[i];
			}
			
				
		}
		int op = evenSum - oddSum > 0 ? 1 : -1;   
		System.out.print(op * (evenSum - oddSum)+ " "); 
	}
}
