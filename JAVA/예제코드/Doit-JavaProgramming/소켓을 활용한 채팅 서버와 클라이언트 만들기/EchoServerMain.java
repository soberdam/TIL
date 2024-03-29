package ch01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class EchoServerMain {

	public static void main(String[] args) {
		try {
			ServerSocket ss = new ServerSocket(50000);
			System.out.println(50000 + " port echo server running...");
			while(true) {
				Socket socket = ss.accept();
				System.out.println(new Date().toString() + ":" + socket.toString());
				System.out.println(socket.getLocalPort());
				System.out.println(socket.getPort());
				
				BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
				
				String temp = br.readLine();
				
				bw.write(temp + " 1\n"); bw.flush();
				bw.write(temp + " 2\n"); bw.flush();
				bw.write(temp + " 3\n"); bw.flush();
				
				bw.close();
				br.close();
				
				socket.close();
						
				
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
