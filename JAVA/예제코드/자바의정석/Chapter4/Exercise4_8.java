package Chapter4;

public class Exercise4_8 {

	public static void main(String[] args) {
		for(int x=0; x<=10; x++) {
			for(int y=0; y<=10; y++) {
				if(x*2+y*4==10) {
					System.out.println("x=" + x + ", y=" + y);
				}
			}
		}
	}
}
