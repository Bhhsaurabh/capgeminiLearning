package ArrayProblems;

import java.util.Scanner;

public class AvgOfEven {
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
		int sum = 0;
		int cnt = 0;
		System.out.println("Avg of Even Ele : "); 
		for(int i = 0 ; i < size ; i++) {
			if(arr[i] % 2 == 0) {
				sum += arr[i];
				cnt++;
			}
				
		}
		System.out.print(sum/cnt+ " "); 
	}
}
