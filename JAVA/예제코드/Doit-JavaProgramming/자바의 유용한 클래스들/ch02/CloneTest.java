package ch02;

public class CloneTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student Lee = new Student(100, "Lee");
		Student Lee2 = Lee;
		Student Shun = new Student(100, "Lee");
		
		Student Lees = (Student)Lee.clone();
		
		System.out.println(Lees.toString());
		
	}

}
