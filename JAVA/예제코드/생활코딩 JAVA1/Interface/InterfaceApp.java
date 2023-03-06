interface Calculable{
	double PI = 3.14;
	int sum(int v1, int v2);
}

interface Printable {
	void print();
}

class AdvancedCal implements Printable {

	public void print() {
		System.out.println("interface");
	}
	
}

class RealCal implements Calculable, Printable {

	public int sum(int v1, int v2) {
		return v1 + v2;
	}
	
	public void print() {
		System.out.println("interface");
	}
	
}


public class InterfaceApp {

	public static void main(String[] args) {
		Printable c = new AdvancedCal();

		c.print();


	}

}
