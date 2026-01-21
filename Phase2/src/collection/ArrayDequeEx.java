package collection;
import java.util.*;
public class ArrayDequeEx {
	public static void main(String[] args) {
		ArrayDeque a = new ArrayDeque<>();
		a.offer(10);
		a.offer(20);
		a.offer(30);
		System.out.println(a);
		a.offerFirst(9); // add at start
		System.out.println(a);
		a.offerLast(6);  // add at last
		System.out.println(a);
		a.poll(); // remove from start
		System.out.println(a);
		a.pollLast(); // remove from end
		System.out.println(a);
	}
}
