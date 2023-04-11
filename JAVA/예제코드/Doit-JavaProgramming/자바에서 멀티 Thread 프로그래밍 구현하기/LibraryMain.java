package ch04;

import java.util.ArrayList;

class Library {
	
	ArrayList<String> shelf = new ArrayList<>();
	
	public Library() {
		shelf.add("태백산맥 1");
		shelf.add("태백산맥 2");
		shelf.add("태백산맥 3");
	}
	
	public synchronized String lendBook() throws InterruptedException {
		Thread t = Thread.currentThread();
		
		if(shelf.size() == 0) {
			System.out.println(t.getName() + " waiting start");
			wait();
			System.out.println(t.getName() + " waiting end");
		}
		String book = shelf.remove(0);
		System.out.println(t.getName() + ": " + book + " lend");
		return book;
	}
	
public synchronized void returnBook(String book) {
		Thread t = Thread.currentThread();
		shelf.add(book);
		notify();
		System.out.println(t.getName() + ": " + book + " return");
	}
}

class Student extends Thread {
	public void run() {
		try {
			
			String title = LibraryMain.lib.lendBook();
			if(title != null) return;
			sleep(5000);
			LibraryMain.lib.returnBook(title);
			
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

public class LibraryMain {
	
	public static Library lib = new Library();
	
	public static void main(String[] args) {
		
		Student student1 = new Student();
		Student student2 = new Student();
		Student student3 = new Student();
		Student student4 = new Student();
		Student student5 = new Student();
		Student student6 = new Student();
		Student student7 = new Student();
		Student student8 = new Student();
		Student student9 = new Student();
		Student student10 = new Student();
		
		student1.start();
		student2.start();
		student3.start();
		student4.start();
		student5.start();
		student6.start();
		student7.start();
		student8.start();
		student9.start();
		student10.start();

	}

}
