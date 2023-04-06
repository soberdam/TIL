package ch02;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionHandling {

	public static void main(String[] args) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("a.txt");
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} finally {
			try {
				if(fis != null)
				fis.close();
			} catch(IOException e) {
				e.printStackTrace();
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("여기도 수행됩니다.");
	}

}
