package lamdaExpression;

public abstract class Student {
	String name;
	int id;
	
	Student(String name , int id){
		this.name = name;
		this.id = id;
	}
	public abstract void display();
}
