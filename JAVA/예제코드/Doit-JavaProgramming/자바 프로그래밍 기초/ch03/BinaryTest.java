package ch03;

public class BinaryTest {

	public static void main(String[] args) {
		
		int num = 10; // 10진수
		int bNum = 0b1010; // 2진수
		int oNum = 012; // 8진수
		int xNum = 0XA; // 16진수
		
		System.out.println(num);
		System.out.println(bNum);
		System.out.println(oNum);
		System.out.println(xNum);
		
		int cNum = 0b01000001; // 65, A
		System.out.println((char)cNum);

	}

}
