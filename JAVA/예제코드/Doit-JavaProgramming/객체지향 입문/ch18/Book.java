package ch18;

public class Book {
	private String author;
	private String title;
	
	public Book() {
		
	}
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public void showBookInfo() {
		System.out.println(author + "," + title);
	}
	
}
