package ch01;

class Outter2 {
	Runnable getRunnable(int i) {
		
		int num = 100;
		
		return new Runnable() {

			@Override
			public void run() {
				//num = 200; // 에러
				// i = 100; // 에러
				System.out.println(i);
				System.out.println(num);
			}
			
		};
	}
	
	Runnable runnable = new Runnable() {

		@Override
		public void run() {
			System.out.println("runnable이 구현된 익명 내부 클래스");
		}
		
	};
}

public class AnonymousInnerTest {

	public static void main(String[] args) {
		Outter2 out = new Outter2();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		System.out.println();
		out.runnable.run();
	}

}
