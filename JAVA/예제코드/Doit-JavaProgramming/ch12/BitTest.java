package ch12;

public class BitTest {

	public static void main(String[] args) {
		
		int num1 = 5; //00000101;
		int num2 = 10; //0001010;
		
		System.out.println(num1 | num2);
		System.out.println(num1 & num2);
		System.out.println(num1 ^ num2);
		
		System.out.println(num1<<2);
		System.out.println(num1);
		System.out.println(num1<<=2);
		System.out.println(num1);

	}

}
