package ch08;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		Student studentKim = new Student(101, "Kim");
		
		studentLee.setKoreanSubject("국어", 90);
		studentLee.setMathSubject("수학", 70);
		
		studentKim.setKoreanSubject("국어", 80);
		studentKim.setMathSubject("수학", 90);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
	}
	

}
