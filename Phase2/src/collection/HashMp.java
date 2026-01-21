package collection;
import java.util.*;

public class HashMp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap hm = new HashMap();
		hm.put(1, "ABC");
		hm.put(8, "b");
		hm.put(9, "c");
		hm.put(10, "d");
		hm.putIfAbsent(10, "e");
		
		System.out.println(hm);
		System.out.println(hm.entrySet());
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		
		for(Object o:hm.entrySet()) {
			System.out.println(o);
		}
		System.out.println("After using iterator");
		Iterator i = hm.entrySet().iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}