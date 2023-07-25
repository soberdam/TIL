package ch7;

class Card {
	// 상수지만 선언과 동시에 초기화 하지 않고, 생성자에서 초기화 할 수 있다.
	final int NUMBER;
	final String KIND;
	static int width = 100;
	static int height = 250;
	
	Card(String kind, int num) {
		KIND = kind;
		NUMBER = num;
	}
	
	Card() {
		this("HEARD", 1);
	}
	
	public String toString() {
		return KIND + " " + NUMBER;
	}
}

public class FinalCardTest {

	public static void main(String[] args) {
		Card c = new Card("HEART", 10);
		System.out.println(c.KIND);
		System.out.println(c.NUMBER);
		System.out.println(c);
	}

}
