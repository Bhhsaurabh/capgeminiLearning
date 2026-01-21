package sortObject;
import java.util.*;
public class BookComparator implements Comparator<Book>{
	public int compare(Book o1 , Book o2) {
		return o1.getPrice() - o2.getPrice();
	}
}
