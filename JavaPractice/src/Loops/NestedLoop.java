package Loops;
import java.util.Scanner;
public class NestedLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Eneter no of rows: ");
		int n = sc.nextInt();
		for(int i = 1 ; i <= n ; i++) {
			for(int j = 1 ; j <= n ; j++) {
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}
}
