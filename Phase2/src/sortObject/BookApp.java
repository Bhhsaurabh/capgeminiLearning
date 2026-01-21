package sortObject;
import java.util.*;
public class BookApp {
	public static void main(String[] args) {
		List<Book>li = new ArrayList<>();
		Book[] books  = {new Book(200),
		 new Book(100),
		 new Book(300),
		 new Book(660),
		 new Book(50),
		 new Book(90)};
		
		for(Book b1 : books) {
			li.add(b1);
		}
		//Collections.sort(li);
		Collections.sort(li ,new BookComparator());
		System.out.println(li);
		
	}
}
