package Array;
import java.util.Scanner;
public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for(int i = 0 ; i <5 ; i++) {
			arr[i] = sc.nextInt();
		}
		for(int it : arr) {
			System.out.println(it);
		}
		
		// arr2
		int[] arr2 = new int[5];
		arr2[0] = 6;
		arr[5] = 2; // index is at max 4 
		System.out.println(arr[5]);// arrayIndexOutOfBound Exception
		
		// making array without new keyword || operator
		int[] arr3 = {20,3,2}; // do not mention the size
	}

}
