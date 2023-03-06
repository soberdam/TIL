import java.io.FileWriter;
import java.io.IOException;

public class WhyMethod {
	public static String twoTimes(String text, String delimiter) {
		String out = "";
		out = out + delimiter + "\n";
		out = out + text + "\n";
		out = out + text + "\n";
		
		return out;
		
	}
	
	public static void main(String[] args) throws IOException {
		
						//인자, argument
		printTwoTimes("A", "-");
		System.out.println(twoTimes("a", "-"));
		FileWriter fw = new FileWriter("out.txt");
		fw.write(twoTimes("a", "*"));
		fw.close();
		
		printTwoTimes("B", "*");
		printTwoTimes("C", "&");

	}
										//매개변수, parameter
	public static void printTwoTimes(String text, String delimeter) {
		System.out.println(delimeter);
		System.out.println(text);
		System.out.println(text);
	}

}
