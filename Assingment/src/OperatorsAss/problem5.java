package OperatorsAss;

public class problem5 {
	public static void main(String[] args) {
		boolean isPhysical = true;
		int att = 59;
		boolean isApproved = true;
		boolean isEli = (isPhysical || (isApproved && att < 60))  ? true : false;
		System.out.println("Is Eli for extra Time : " + isEli);
	}
}
