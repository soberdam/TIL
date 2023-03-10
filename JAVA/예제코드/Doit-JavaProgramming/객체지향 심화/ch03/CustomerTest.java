package ch03;

public class CustomerTest {

	public static void main(String[] args) {
//		Customer customerLee = new Customer();
//		customerLee.setCustomerName("Lee");
//		customerLee.bonusPoint = 1000;
//		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 10000;
		System.out.println(customerKim.showCustomerInfo());
	}

}
