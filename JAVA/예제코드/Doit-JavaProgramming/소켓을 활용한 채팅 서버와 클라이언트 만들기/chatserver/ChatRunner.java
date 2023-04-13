package ch02.chatserver;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatRunner extends Thread {

	private boolean flag = false;
	Socket socket = null;
	BufferedReader br;
	BufferedWriter bw;

	public ChatRunner(Socket socket) throws IOException {
		this.socket = socket;
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
	}

	public void run() {
		try {
			while (!flag) {
				String msg;

				msg = br.readLine();

				if (msg != null && !msg.equals("")) {
					ChatServer.room.sendMessageAll(msg);
				} else {
					flag = true;
				}
			}
			ChatServer.room.removeChatRunner(this);
			br.close();
			bw.close();
			socket.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void sendMessage(String msg) throws IOException {
		bw.write(msg + "\n");
		bw.flush();
	}

	public String toString() {
		return socket.toString();
	}
}
