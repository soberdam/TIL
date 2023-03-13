package ch11;

public class CalculatorTest {

	public static void main(String[] args) {
		CompleteCalc calc = new CompleteCalc();
		
		int num1 = 10;
		int num2 = 5;
		
		System.out.println(calc.add(num1, num2));
		System.out.println(calc.substract(num1, num2));
		System.out.println(calc.times(num1, num2));
		System.out.println(calc.divide(num1, num2));
		
		calc.showInfo();
	}

}
