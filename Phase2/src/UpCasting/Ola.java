package UpCasting;

import java.util.Scanner;

public class Ola {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Press->  1(Mini)🤡  2(Sedan)🤗 - 3(luxury)😎  : ");
		int choice = sc.nextInt();
		Cab c = null;
				switch(choice) {
				case 1: 
					c = new Mini();
				break;
				
				case 2: 
					c = new Sedan();
				break;
				
				case 3:
					c = new Luxury();
				break;
				
				default : 
					System.out.println("Enter Valid Number 💩");
				
		}
				System.out.println(
					    c != null ? "You Booked! 🚗 " + c : "💩!"
					);
	}
}
