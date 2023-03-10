package ch09;

public abstract class Computer {
	
	public void turnOn() {
		System.out.println("Computer turnOn");
	}
	
	public void turnOff() {
		System.out.println("Computer turnOff");
	}
	
	public abstract void display();
	public abstract void typing();
}
