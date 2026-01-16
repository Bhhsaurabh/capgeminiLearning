package has_a_relationship;

public class LIbrary {
	private String libName;
	
	Book[] b = new Book[5];
	
	LIbrary(String libName){
		this.libName = libName;
	}
	
	public Book[] getBook() {
		return b ;
	}
	int i = 0;
	public void setBook(Book b) {
		this.b[i] = b;
		i++;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}
	
	public static void main(String[] args) {
		LIbrary lib = new LIbrary("Shraddha Library");
		
		System.out.println("Library Name: " + lib.getLibName());
		System.out.println();
		lib.setBook(new Book("To Kill a Mockingbird", "Harper Lee", 1960));
		lib.setBook(new Book("1984", "George Orwell", 1949));
		lib.setBook(new Book("Pride and Prejudice", "Jane Austen", 1813));
		lib.setBook(new Book("The Great Gatsby", "F. Scott Fitzgerald", 1925));
		
		Book b[] = lib.getBook();
		
		for(Book c : b) {
			if(c == null) continue;
			System.out.println("Book: " + c.getBook());
			System.out.println("Author: " + c.getAutor());
			System.out.println("Book Published: " + c.getPublished());
			System.out.println();
			
		}
		
		
	}
}
