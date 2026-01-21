package collection;
import java.util.*;
public class LinkedListss {
	public static void main(String[] args) {
		List<Integer> li = new LinkedList<>();
		li.add(10);
		li.add(20);
		li.add(30);
		
		Collections.sort(li);
		System.out.println(li);
		System.out.println(li.contains(20));
	}
}
