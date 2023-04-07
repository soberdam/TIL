package ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");

			int i;

			while((i = fis.read()) != -1) {
				System.out.println((char)i);
			}
			System.out.println("end");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
		}
	}

}
