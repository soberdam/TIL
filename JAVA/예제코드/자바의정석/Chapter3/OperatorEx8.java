package Chapter3;

public class OperatorEx8 {

	public static void main(String[] args) {
		int a = 1_000_000;
		int b = 2_000_000;
		
		long c = a * b; // a * b는 int, 오버플로우 발생
		System.out.println(c);
	}

}
