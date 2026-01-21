package collection;
import java.util.*;
public class StackEx {
	public static void main(String[] args) {
		Stack st = new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.pop();
		System.out.println(st.peek());
	}
}
