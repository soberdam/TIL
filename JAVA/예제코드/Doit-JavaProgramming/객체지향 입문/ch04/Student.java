package ch04;

public class Student {

	int studentId;
	String studentName;
	String studentAddress;
	
	public Student() {
	}
	
	public Student(int studentId, String studentName){
		this.studentId = studentId;
		this.studentName = studentName;
	}
	public Student(int studentId, String studentName, String studentAddress){
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentAddress = studentAddress;
	}
	public void showStudentInfo() {
		System.out.println(studentId + "," + studentAddress);
	}
	
	public String getStudentName() {
		return studentName;
	}

}
