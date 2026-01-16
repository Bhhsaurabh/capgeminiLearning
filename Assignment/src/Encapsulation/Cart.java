package Encapsulation;

public class Cart {
	private int totalAm;
	private String item;
	private int cnt;
	private int price;
	
	Cart(){
		
	}
	Cart(String item , int price){
		this.item = item;
		this.price = price;
		++cnt;
	}
	
	public void addItem(String item , int cnt) {
		if(item.equals(this.item)) {
			this.cnt += cnt;
			totalAm += totalAm + (price * cnt);
		}
	}
	
	public void removeItem(String item , int cnt) {
		if(this.item.equals(item) && this.cnt > 0) {
			this.cnt -= cnt;
			totalAm -= totalAm - (price * cnt);
		}
	}
	
	public void getTotalAm() {
		System.out.println("Item : " + item);
		System.out.println("Price : " + price);
		System.out.println("No of item : " + (cnt - 1));
		System.out.println("Total price : " + totalAm);
	}
	
}
