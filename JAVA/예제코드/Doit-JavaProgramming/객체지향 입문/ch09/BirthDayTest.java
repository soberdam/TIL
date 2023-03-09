package ch09;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay birthday = new BirthDay();
		birthday.setYear(2023);
		birthday.setMonth(5);
		birthday.setDay(2);
		
		System.out.println(birthday.isValid());
	}

}
