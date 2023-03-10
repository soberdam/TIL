package ch04;

public class CustomerTest {

	public static void main(String[] args) {
		
		int price = 10000;
		
		Customer customerLee = new Customer(10010, "Lee");
		customerLee.setCustomerName("Lee");
		customerLee.bonusPoint = 1000;
		int cost = customerLee.calcPrice(price);
		System.out.println(customerLee.showCustomerInfo() + " 지불 금액은 " + cost);
		
		VIPCustomer customerKim = new VIPCustomer(10020, "Kim");
		customerKim.setCustomerName("Kim");
		customerKim.bonusPoint = 10000;
		cost = customerKim.calcPrice(price);
		System.out.println(customerKim.showCustomerInfo() + " 지불 금액은 " + cost);
		
		Customer customerPark = new VIPCustomer(10030, "Park");
		customerPark.setCustomerName("Park");
		cost = customerPark.calcPrice(price);
		System.out.println(customerPark.showCustomerInfo() + " 지불 금액은 " + cost);
		
	}

}
