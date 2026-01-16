package Encapsulation;

public class Result {
	private boolean res = true;
	private double hindi , english, math , science;
	
	Result(double hindi , double english , double math , double science){
		this.hindi = hindi;
		this.english = english;
		this.math = math;
		this.science = science;
		
		
	}
	
	public void getRes() {
		double per = ((hindi + english + math + science)/400) * 100;
		if(hindi < 33 ||  english < 33 || math < 33 || science < 33) {
			System.out.println("Your Percentage: " + per + "%");
			System.out.println("Status : " + "Fail");
		}
		else if(per >= 40) {
			System.out.println("Your Percentage: " + per + "%");
			System.out.println("Status : " + "Pass");
		}else {
			System.out.println("Your Percentage: " + per + "%");
			System.out.println("Status : " + "Fail");
		}
	}
}
