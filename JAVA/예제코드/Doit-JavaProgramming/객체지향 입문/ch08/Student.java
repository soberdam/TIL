package ch08;

public class Student {
	
	int studentId;
	String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	Subject korean = new Subject();
	Subject math = new Subject();
	
	public void setKoreanSubject(String subjectName, int score) {
		korean.subjectName = subjectName;
		korean.score = score;
	}
	
	public void setMathSubject(String subjectName, int score) {
		math.subjectName = subjectName;
		math.score = score;
	}
	
	public void showStudentScore() {
		int total = korean.score + math.score;
		
		System.out.println(studentName + "의 점수는" + total + "점 입니다.");
	}
	
	
}
