package Encapsulation;

public class Marks {
	private double marks;
	Marks(){
		
	}
	Marks(double marks){
		setMarks(marks);
	}
	public void setMarks(double marks) {
		if(marks < 100) {
			this.marks = marks;
			
		}
		else {
			System.out.println("Please enter marks <= 100");
		}
	}
	
	public void getMarks() {
		System.out.println("Marks is " + marks);
	}
	
}
