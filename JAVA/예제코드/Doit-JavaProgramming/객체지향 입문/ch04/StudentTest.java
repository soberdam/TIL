package ch04;

public class StudentTest {

	public static void main(String[] args) {
		Student studentLee = new Student(101, "Lee");
		studentLee.studentAddress = "Seoul";
		
		Student studentKim = new Student(102, "Kim", "New York");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		
		System.out.println(studentLee.getStudentName());
		System.out.println(studentLee);
		
	}

}
