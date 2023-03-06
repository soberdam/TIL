
public class AccountingApp {
	//���ް���
	public static double valueOfSupply;
	//�ΰ���ġ����
	public static double vatRate = 0.1;
	
	public static double getVAT() {
		
		return valueOfSupply * vatRate;
	}
	
	public static double getTotal() {
		
		return valueOfSupply + getVAT();
	}

	public static void main(String[] args) {
		valueOfSupply = 10000.0;
		//�ΰ���
		double vat = getVAT();
		//�հ�
		double total = getTotal();
		
		
		
		double expenseRate = 0.3;
		double expense = valueOfSupply * expenseRate;
		double income = valueOfSupply - expense;
		double dividend1 = income * 0.5;
		double dividend2 = income * 0.3;
		double dividend3 = income * 0.2;
		
		System.out.println("Value of supply : " + valueOfSupply);
		System.out.println("VAT : " + vat);
		System.out.println("Total : " + total);
		System.out.println("Exnpense : " + expense );
		System.out.println("Income : " + income);
		System.out.println("Dividend 1 : " + dividend1);
		System.out.println("Dividend 2 : " + dividend2);
		System.out.println("Dividend 3 : " + dividend3);
	}

}
