package collection;
import java.util.*;
public class TreeSetEx {
	public static void main(String[] args) {
		TreeSet<Student> set  = new TreeSet<>(new ComparatorClass());
		set.add(new Student("Saurabh" , 10));
		set.add(new Student("aman" , 20));
		set.add(new Student("Suman" , 30));
		set.add(new Student("ram" , 5));
		set.add(new Student("shyam" , 7));
		
		System.out.println(set);
		
	}
}
