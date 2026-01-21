package collection;
import java.util.*;
public class PriorityQueueEx {
	public static void main(String[] args) {
		PriorityQueue pq = new PriorityQueue();
		pq.offer(50);
		pq.offer(20);
		pq.offer(2);
		pq.offer(60);
		pq.offer(320);
		
		System.out.println(pq);
	}
}
