package ch03;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest2 {

	public static void main(String[] args) {
		try (FileOutputStream fos = new FileOutputStream("output2.txt", true);) {
			byte[] bs = new byte [26];
			byte date = 65;
			for (int i=0; i<bs.length; i++) {
				bs[i] = date++;
			}
			fos.write(bs);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		System.out.println("출력이 완료되었습니다.");
	}

}
