package ch08;

public class LocalVariableType {

	public static void main(String[] args) {
		
		var i = 10;
		var j = 10.0;
		var str = "hello";
		
		System.out.println(i);
		System.out.println(j);
		System.out.println(str);
		
		str = "hi";
		// str = 3; 오류
		System.out.println(str);
	}

}
