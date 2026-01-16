package MultiLevelInheritance;

public class Student extends Person{
	 int rollNo;
	
	 Student(String name , int rollNo){
		 super(name);
		 this.rollNo = rollNo;
	 }
}
