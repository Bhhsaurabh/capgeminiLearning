package collection;
import java.util.*;
public class CollectionFunc {
	public static void main(String[] args) {
		List<Integer> li1 = new ArrayList<>();
		li1.add(10);
		li1.add(20);
		li1.add(90);
		li1.add(40);
		li1.add(33);
		li1.add(60);
		List<Integer> li2 = new ArrayList<>();
		li2.add(10);
		li2.add(20);
		li2.add(30);
		li2.add(60);
		
		//li1.clear();
		System.out.println(li1);
//		li1.remove(0);
//		System.out.println(li1);
//		
//		li1.removeAll(li2);
//		System.out.println(li1);
//		
//		System.out.println(li2);
//		li1.retainAll(li2);
//		System.out.println(li1);
		
		
		// sorting
		Collections.sort(li1);
		System.out.println(li1);
	}
}
