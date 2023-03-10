package ch04;

public class VIPCustomer extends Customer{
	
	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
	}


	public int getAgendId() {
		return agentId;
	}


	@Override
	public int calcPrice(int price) {
		bonusPoint += (int)(price*bonusRatio);
		price -= (int)(price*salesRatio);
		return price;
		
	}


	@Override
	public String showCustomerInfo() {
		
		return super.showCustomerInfo() + " 상담원 아이디는 " + agentId;
	}
	
	
	
}
