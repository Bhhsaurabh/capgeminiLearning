package has_a_relationship;

public class Book {
	private String book;
	private String autor;
	private int published;
	
	Book(String book , String author , int published){
		this.book = book;
		this.autor = author;
		this.published = published;
	}
	public String getBook() {
		return book;
	}
	public void setBook(String book) {
		this.book = book;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public int getPublished() {
		return published;
	}
	public void setPublished(int publised) {
		this.published = publised;
	}
	
	
	
}
