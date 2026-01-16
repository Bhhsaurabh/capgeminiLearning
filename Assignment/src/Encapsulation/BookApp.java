package Encapsulation;

public class BookApp {
	public static void main(String[] args) {
		Book b = new Book(200);
		b.getPrice();
		b.setPrice(99);
		b.getPrice();
	}
}
