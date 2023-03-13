package ch15;

public class BookShelfTest {

	public static void main(String[] args) {
		
		Queue bookShelf = new BookShelf();
		
		bookShelf.enQueue("태백산맥1");
		bookShelf.enQueue("태백산맥2");
		bookShelf.enQueue("태백산맥3");
		
		System.out.println(bookShelf.getSize());
		
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		System.out.println(bookShelf.deQueue());
		
		System.out.println(bookShelf.getSize());
	}

}
