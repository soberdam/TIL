package ch01;

class MyThread2 implements Runnable {

	@Override
	public void run() {
		int i;
		for (i = 0; i<200; i++) {
			System.out.print(i + '\t');
		}
	}
	
}


public class ThreadTest2 {

	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		
		Thread th1 = new Thread(new MyThread2());
		
		
		MyThread mth = new MyThread();
		Thread th2 = new Thread(mth);
		
		th1.start();
		th2.start();
		
		System.out.println("end");
		
	}

}
