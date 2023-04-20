package Chapter6;

public class CallStackTest {

	public static void main(String[] args) {
		firstMethod();
	}
	
	public static void firstMethod() {
		secondMethod();
	}

	public static void secondMethod() {
		System.out.println("secondMethod()");
	}

}
