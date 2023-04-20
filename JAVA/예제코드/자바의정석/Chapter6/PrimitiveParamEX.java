package Chapter6;

class Data { int x; }
public class PrimitiveParamEX {

	public static void main(String[] args) {
		Data d = new Data();
		d.x = 10;
		System.out.println("main() : x = " + d.x);
		
		change(d.x);
		System.out.println("after change (d.x)");
		System.out.println("main() : x = " + d.x);
	}
	
	public static void change(int x) {
		x = 1000;
		System.out.println("chanhe() : x  = " + x);
	}
}
