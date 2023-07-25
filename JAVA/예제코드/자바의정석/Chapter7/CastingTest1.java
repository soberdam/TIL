package ch7;

public class CastingTest1 {

	public static void main(String[] args) {
		Car car = null;
		FireEngine fe = new FireEngine();
		FireEngine fe2 = null;
		
		fe.water();
		car = fe;
//		car.water() // Car 타입에서는 water()를 호출할 수 없다
		fe2 = (FireEngine)car;
		fe.water();
	}

}

class Car {
	String color;
	int door;
	
	void drive() {
		System.out.println("drive");
	}
	
	void stop() {
		System.out.println("stop");
	}
	
	
}

class FireEngine extends Car {
	void water() {
		System.out.println("water");
	}
}
