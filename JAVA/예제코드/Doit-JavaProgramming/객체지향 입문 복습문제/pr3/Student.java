package pr3;

import java.util.ArrayList;

public class Student {
	private int studentId;
	private String studentName;
	
	public Student(int studentId, String studentName) {
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	ArrayList<Subject> subjectList = new ArrayList<Subject>();
	
	public void addSubject(String name, int score) {
		Subject s = new Subject();
		s.setName(name);
		s.setScore(score);
		subjectList.add(s);
	}
	
	public void showStudentInfo() {
		int total = 0;
		
		for(Subject s : subjectList) {
			total += s.getScore();
			System.out.println(studentName +"학생의 " + s.getName() + "과목의 점수는 " + s.getScore() + "점 입니다.");
		}
		System.out.println(studentName + "학생의 총 점수는 " + total + "점 입니다." );
	}
}
