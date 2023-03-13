package ch15;

public class Customer implements Buy, Sell {

	@Override
	public void sell() {
		System.out.println("Customer sell");
	}

	@Override
	public void buy() {
		System.out.println("Customer buy");
	}
	
	public void sayHello() {
		System.out.println("say hello");
	}

	@Override
	public void order() {
		
		System.out.println("customer order");
	}
}
