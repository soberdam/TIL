package Chapter3;

public class OperatorEx31 {

	public static void main(String[] args) {
		int hex = 0xABCD;
		int mask = 0xF;
		
		System.out.printf("hex=%#X%n", hex);
		System.out.printf("%X%n", hex & mask); // 16진수 끝의 한자리를 mask와 and연산으로 추출한다.
		
		hex = hex >> 4; // 2진법에서 >> 4는 16진법에서 >> 1과 같다.
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
		hex = hex >> 4;
		System.out.printf("%X%n", hex & mask);
		
	}

}
