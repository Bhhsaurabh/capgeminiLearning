package PatternPrinting;

import java.util.Scanner;

public class DiamondPattern2 {
	public static void main(String[] args) {
		System.out.println("Enter you num : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 1 ; i < n * 2 ; i++) {
			for(int j = 1 ; j < n * 2; j++) {
				if(i + j <= n + 1 || j - i >= n - 1 || i - j >= n - 1 || i + j >= (n * 3) -1 ){
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
