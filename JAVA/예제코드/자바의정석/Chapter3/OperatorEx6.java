package Chapter3;

public class OperatorEx6 {

	public static void main(String[] args) {
		byte a = 10;
		byte b = 20;
		byte c = a + b; // 산술 변환에 의해 int보다 작은 byte끼리의 합이 int로 형변환 뒤 연산되므로 (byte)로 명시적 형변환이 필요하다.
		System.out.println(c);
	}

}
