
public class ExceptionApp {

	public static void main(String[] args) {
		int[] numbers = {10, 20, 30};
		System.out.println(1);
		try {
		System.out.println(2);
//		System.out.println(numbers[3]);
		System.out.println(3);
		System.out.println(2/0);
		System.out.println(4);
		} catch(ArithmeticException e) {
			System.out.println("계산 오류입니다." + e.getMessage());
			e.printStackTrace();
		} catch(Exception e) {
			System.out.println("무언가 문제가 있습니다..");
		} 
		System.out.println(5);

	}

}
