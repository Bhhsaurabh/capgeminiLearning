package ArrayProblems;

import java.util.Scanner;

public class PrimeEleInArray {
	public static boolean isPrime(int num) {
		boolean isP = true;
		for(int i = 2 ; i * i <= num ; i++) {
			if(num % i == 0) {
				isP = false;
				break;
			}
		}
		return isP;
	}
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
		System.out.println("These are Prime no in Array : "); 
		for(int i = 0 ; i < size ; i++) {
			if(isPrime(arr[i])) {
				System.out.print(arr[i] + " "); 
			}
		}
		
	}
}
