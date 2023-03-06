import java.io.FileWriter;
import java.io.IOException;

public class CheckedException {

	public static void main(String[] args) {
		//try catch finally
		FileWriter f1 = null;
		try {
		 f1 = new FileWriter("write.txt");
		 f1.write("hello");
		
		} catch(IOException e) {
			e.printStackTrace();
		} finally {
			if(f1 != null) {
				try {
					f1.close();
				} catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}


