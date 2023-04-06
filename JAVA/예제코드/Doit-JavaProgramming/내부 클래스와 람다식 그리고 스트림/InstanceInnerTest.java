package ch01;
class OutClass {
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass() {
		inClass = new InClass();
	}
	
	class InClass {
		int inNum = 100;
		static int sInNum = 200;
		
		
		void inTest() {
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		    System.out.println("InClass sInNum = " + sInNum + "(내부 클래스의 정적 변수)");
		}
		
		static void sTest() {
			System.out.println("outter static method" + sNum);
			System.out.println("inner static method" + sInNum);
		}
	}
	public void usingClass() {
		inClass.inTest();
	}
}
public class InstanceInnerTest {

	public static void main(String[] args) {
		OutClass outClass = new OutClass();
		outClass.usingClass();
		System.out.println();
		
		System.out.println("내부 클래스의 정적 변수와 정적 메서드 호출 자바 16부터 가능");
		System.out.println(OutClass.InClass.sInNum);
		OutClass.InClass.sTest();
		
		System.out.println();
		//외부클래스를 생성해야 내부클래스 생성 가능
		OutClass.InClass inner = outClass.new InClass();
		inner.inTest();
		System.out.println();
	}

}
