package ch02;

public class Test {

	public static void main(String[] args) {
		Add addF = (x, y) -> x+y;
		System.out.println(addF.add(10, 20));
		
		MyMaxNumber max = (x, y) -> (x>=y) ? x : y;
		System.out.println(max.getMax(5, 10));
	}

}
