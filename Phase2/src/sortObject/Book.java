package sortObject;

public class Book implements Comparable<Book>{
	private int price;
	Book(int price){
		this.price = price;
	}
	public String toString() {
		return "Book[ "  + price + " ]";
	}
	public int getPrice() {
		return price;
	}
	public int compareTo(Book b1) {
		return this.price - b1.price;
	}
}
