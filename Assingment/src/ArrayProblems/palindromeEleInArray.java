package ArrayProblems;

import java.util.Scanner;

public class palindromeEleInArray {
	public static boolean isPali(int num) {
		int org = num;
		int rev = 0;
		int rem = 0;
		while(num>0) {
			rem = num % 10;
			rev = rev * 10 + rem;
			num = num/10;
		}
		return rev == org;
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
		System.out.println("These are Pali no in Array : "); 
		for(int i = 0 ; i < size ; i++) {
			if(isPali(arr[i])) {
				System.out.print(arr[i] + " "); 
			}
		}
		
	}
	
}
