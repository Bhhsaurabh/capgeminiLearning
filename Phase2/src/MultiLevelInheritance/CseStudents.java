package MultiLevelInheritance;

public class CseStudents extends Student{
	String sub;
	
	CseStudents(String name , int rollNo , String sub){
		super(name , rollNo);
		this.sub = sub;
	}
	
	public void display() {
		System.out.println("Name: " + name);
		System.out.println("Roll No : " + rollNo);
		System.out.println("Branch : " + sub);
	}
}
