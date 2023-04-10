package ch02;

import java.io.IOException;

public class TerminateThread extends Thread {
	
	private boolean flag = true;
	int i;
	
	public TerminateThread(String name) {
		super(name);
	}
	
	public void run() {
		while(flag) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		System.out.println(getName() + "end");
	}
	
	public void setFlag(boolean flag) {
		this.flag = flag;
	}

	public static void main(String[] args) throws IOException {
		TerminateThread threadA = new TerminateThread("ThreadA");
		TerminateThread threadB = new TerminateThread("ThreadB");
		TerminateThread threadC = new TerminateThread("ThreadC");
		
		threadA.start();
		threadB.start();
		threadC.start();
		int i;
		
		while(true) {
			
			i = System.in.read();
			if(i == 'A') {
				threadA.setFlag(false);
			} else if(i == 'B') {
				threadB.setFlag(false);
			} else if(i == 'C') {
				threadC.setFlag(false);
			} else if (i == 'M') {
				threadA.setFlag(false);
				threadB.setFlag(false);
				threadC.setFlag(false);
				break;
			} else if(i == '\n' || i == '\r') {
				;
			} else {
				System.out.println("type again");
			} 
		}
		
		System.out.println("main end");

	}

}
