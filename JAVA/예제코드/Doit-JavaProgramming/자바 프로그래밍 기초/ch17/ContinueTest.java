package ch17;

public class ContinueTest {

	public static void main(String[] args) {
		
		for(int i=1; i<=100; i++) {
			
			if((i%3)!=0) {
				continue;
			}
			System.out.println(i);
		}
	}

}
