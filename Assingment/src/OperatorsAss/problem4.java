package OperatorsAss;

public class problem4 {
	public static void main(String[] args) {
		int dic = 100;
		int totalPur = 3000;
		boolean isMem = true;
		int noOfTimeVis = 4;
		boolean isELi = noOfTimeVis > 1 || isMem && totalPur >= 2000 ? true : false;
		totalPur = isELi ? totalPur -= dic  : totalPur;
		System.out.println("Is Eli for Dis : " + isELi);
		System.out.println("Total Pur : " + totalPur);
	}
}
