package ch03;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {

	public static void main(String[] args) {
		FileInputStream fis = null;

		try {
			fis = new FileInputStream("input.txt");
			
			byte [] bs = new byte[10];
			int i;

			while((i = fis.read(bs)) != -1) {
				
				/*for(byte b : bs ) {
					System.out.print((char)b);
				}*/
				
				for(int k=0; k<i; k++) {
					System.out.print((char)bs[k]);
				}
				System.out.println(": " + i + "바이트 읽음");
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
