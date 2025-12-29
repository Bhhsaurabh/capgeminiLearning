package PatternPrinting;

import java.util.Scanner;

public class TrianglePattern {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter you num : ");
		int num = sc.nextInt();
		for(int i = 1 ; i <= num ; i++) {
			for(int j = 1 ; j < num *2 ; j++) {
				if(i + j >= num + 1 && j -i <= num -1) {
					System.out.print("* ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
	}
}
