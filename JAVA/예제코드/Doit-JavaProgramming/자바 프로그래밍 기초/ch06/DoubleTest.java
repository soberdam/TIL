package ch06;

public class DoubleTest {

	public static void main(String[] args) {

			double dNum = 3.14;
			float fNum = 3.14F;
			
			System.out.println(dNum);
			System.out.println(fNum);
			
			double myNum = 1;
			for(int i =0; i<10000; i++) {
				myNum = myNum + 0.1;
			}
			System.out.print(myNum); // 지수부가 완전한 0을 표현할 수 없다.
	}
			

}
