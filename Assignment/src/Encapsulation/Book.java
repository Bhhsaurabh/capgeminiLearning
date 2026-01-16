package Encapsulation;

public class Book {
	private int price;
	
	Book(int price){
		setPrice(price);
	}
	public void setPrice(int price) {
		if(price >=0) {
			this.price = price;
		}
		else {
			System.out.println("Price can not be negative!");
		}
	}
	
	public void getPrice() {
		System.out.println("Price: " + price);
	}
	
}
