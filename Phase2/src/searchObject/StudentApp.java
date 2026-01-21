package searchObject;
import java.util.*;
public class StudentApp {
	public static void main(String[] args) {
		ArrayList ar =new  ArrayList();
		
		ar.add(new Student(1 , "Saurabh"));
		ar.add(new Student(2 , "Ankesh"));
		ar.add(new Student(3 , "Tammanah"));
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Student Id: ");
		int id = sc.nextInt();
		
		ListIterator li = ar.listIterator();
		
		boolean isFound = false;
		while(li.hasNext()) {
			 Student temp =(Student)li.next();
			 if(temp.getId() == id) {
				 isFound = true;
				 System.out.println("Student Exists...>!!!");
				 System.out.println("Student Name: " + temp.getName());
				 break;
			 }
		}
		if(!isFound) {
			System.out.println("No Student found");
		}
	}
}
