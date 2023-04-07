package ch04;

public class StudentTest {

	public static void main(String[] args) {
		MyLogger myLogger = MyLogger.getMyLogger();
		
		String name = null;
		
		try {
			Student student = new Student(name);
		} catch(StudentNameFormatException e) {
			myLogger.log(e.getMessage());
		}
		
		try {
			Student student = new Student("Edword John Kim Test");
		} catch(StudentNameFormatException e) {
			myLogger.log(e.getMessage());
		}
		
		Student student = new Student("James");
	}

}
