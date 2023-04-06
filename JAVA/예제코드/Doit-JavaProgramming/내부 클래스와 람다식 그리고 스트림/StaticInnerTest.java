package ch01;

class OutClass2 {
	private int num = 10;
	private static int sNum = 20;
	
	
	static class InStaticClass {
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
//			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)"); // 외부 클래스 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		    System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
		}
		
		static void sTest() {
			//num += 10; // 외부 클래스 인스턴스 변수 사용 불가
			//inNum += 100; // 내부 클래스 인스턴스 변수도 사용 불가
			System.out.println("outter static method" + sNum);
			System.out.println("inner static method" + sInNum);
		}
	}
}
public class StaticInnerTest {

	public static void main(String[] args) {
		//외부클래스 생성하지 않고 바로 내부클래스 생성
		OutClass2.InStaticClass sInClass = new OutClass2.InStaticClass();
		System.out.println("정적 내부 클래스 일반 메소드 호출");
		sInClass.inTest();
		System.out.println();
		
		System.out.println("정적 내부 클래스 정적 메소드 호출");
		OutClass2.InStaticClass.sTest();
	}

}

