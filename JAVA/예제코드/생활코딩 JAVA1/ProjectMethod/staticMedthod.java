class Print {
	public String delimiter;
	
	// 인스턴스를 생성해서 호출하는 메소드
	public void a() {
		System.out.println(this.delimiter);
		System.out.println("a");
		System.out.println("a");
	}
	
	// 클래스에서 호출하는 메소드
	public static void b(String delimiter) {
		System.out.println(delimiter);
		System.out.println("b");
		System.out.println("b");
	}
	
}

public class staticMedthod {

	public static void main(String[] args) {
		
		Print t1 = new Print();
		t1.delimiter = "-";
		t1.a();
		
		Print.b("*");
		
	}

}
