package ch7;

public class CastingTest2 {

	public static void main(String[] args) {
		Car car = new Car();
		FireEngine fe = null;
		
		car.drive();
		fe = (FireEngine)car; // 컴파일은 OK, 실행 시 에러가 발생 ClassCastException
		fe.drive();
		
	}

}

