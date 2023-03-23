package Chapter3;

public class OperatorEx16 {

	public static void main(String[] args) {
		float pi = 3.141592f;
		float shortPi = (int) (pi * 1000) / 1000f; // 소수점 셋째 자리까지 표현하는 방법
		System.out.println(shortPi);
	}

}
