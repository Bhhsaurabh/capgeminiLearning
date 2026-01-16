package Inheritance;

public class Student extends Person{
		int id;
		
		Student(String name , int id){
			super(name);
			this.id = id;
		}
		public void display() {
			System.out.println(name);
			System.out.println(id);
		}
		
		public static void main(String[] main) {
			Student s1 = new Student("Saurabh" , 1);
			s1.display();
		}
}
