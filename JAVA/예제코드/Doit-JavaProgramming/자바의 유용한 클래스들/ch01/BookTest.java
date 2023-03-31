package ch01;

class Book extends Object {
	private String title;
	private String author;
	
	public Book (String title, String author) {
		this.title = title;
		this.author = author;
		
		
	}

	@Override
	public String toString() {
		return title + "," + author;
	}
}

public class BookTest {


	
	public static void main(String[] args) {
		Book book = new Book("태백산맥", "조정래");
		System.out.println(book.toString());
		String str = new String("test");
		System.out.println(str);
		Integer integer = new Integer(100);
		System.out.println(integer);
		// String 이나 Integer 클래스는 toString()이 override 되어있기 때문에 객체 주소가 아닌 기본 타입처럼 값 출력 
	}

}
