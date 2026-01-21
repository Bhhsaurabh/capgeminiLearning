package collection;
import java.util.*;
public class ArrayLists {
	public static void main(String[] args) {
		ArrayList a = new ArrayList();
		a.add(10);
		a.add("heelo");
		a.add(10.6);
		
		System.out.println(a);
		
		System.out.println(a.get(0));
		
		System.out.println("--------------------");
		//for each
		
		for(Object o : a) {
			System.out.print(o + " ");
		}
		System.out.println();
		System.out.println("---------------------");
		
		
		// iterator
		
		Iterator i = a.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		System.out.println("------------------------");
		
		//listIterator
		ListIterator li = a.listIterator(1);
		
		while(li.hasNext()) {
			System.out.println(li.next());
		}
		
		System.out.println("---------------------------");
		while(li.hasPrevious()) {
			System.out.println(li.previous());
		}
		
	}
}
