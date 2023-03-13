package ch14;

public interface Calc {
	double PI = 3.14;
	int ERROR = -999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	default void description() {
		myMethod();
		myStaticMethod();
		System.out.println("정수를 계산합니다.");
		
	}
	
	private void myMethod() {
		System.out.println("Private Method");
	}
	
	static int total(int[] arr) {
		myStaticMethod();
		int total = 0;
		for(int i: arr) {
			total += i;
		}
		return total;
	}
	
	private static void myStaticMethod() {
		System.out.println("Private Static Method");
	}
}
