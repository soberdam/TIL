package ch05;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedStreamCopyTest {

	public static void main(String[] args) {
		long millisecond = 0;
		try (FileInputStream fis = new FileInputStream("a.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);
				BufferedOutputStream bos = new BufferedOutputStream(fos)) {

			millisecond = System.currentTimeMillis();
			int i;
			while ((i = bis.read()) != -1) {
				bos.write(i);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		millisecond = System.currentTimeMillis() - millisecond;

		System.out.println("파일을 복사하는 데 " + millisecond + " millisecond 소요되었습니다.");
	}

}
