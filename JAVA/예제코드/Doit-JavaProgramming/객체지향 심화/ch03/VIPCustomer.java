package ch03;

public class VIPCustomer extends Customer{
	
	private int agentId;
	double salesRatio;
	
	public VIPCustomer(int customerId, String customerName) {
		super(customerId, customerName);
		customerGrade = "VIP";
		salesRatio = 0.1;
		bonusRatio = 0.05;
		System.out.println("VIPCustomer(int, String) call");
	}


	public int getAgendId() {
		return agentId;
	}
}
