package Array;
import java.util.Scanner;
public class TwoDimentionalArray {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[][] arr = {{1,2,4} , {5,4,6}}; // do not mention row/col size
		System.out.println(arr[0][1]);
		System.out.println("No of row : " + arr.length);
		System.out.println("No of Col : " + arr[0].length);
		
		// Declaring 2d array using new KeyWord
		int[][] arr2 = new int[2][3]; //[   [] , []  ]  two list inside one list
		
		for(int row = 0 ; row < 2 ; row++) {
			for(int col = 0 ; col < 3 ; col++) {
				System.out.print("Enter you  no : ");
				arr[row][col] = sc.nextInt();
			}
		}
		for(int row = 0 ; row < 2 ; row++) {
			for(int col = 0 ; col < 3 ; col++) {
				
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		
		
	}
}
