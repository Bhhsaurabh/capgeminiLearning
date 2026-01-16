package Encapsulation;

public class Employee {
	private int salary;
	
	Employee(){
		
	}
	Employee(int salary){
		setSalary(salary);
	}
	
	public void setSalary(int salary) {
		if(salary > 0) {
			
			this.salary = salary;
		}else {
			System.out.println("Please enter valid amount");
		}
	}
	public void getSalary() {
		System.out.println("Salray : " + salary);
	}
	
}
