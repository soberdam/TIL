package ch02.chatclient;

import java.io.IOException;

public class ChatClientMain {
	public static void main(String[] args ) throws IOException {
		
	
	ChatClient client;
	String nickname;
	nickname = "봄";
	client = new ChatClient(nickname, "127.0.0.1", 20000);
	client.setSize(300, 200);
	client.setTitle(nickname);
	client.setVisible(true);
	
	
	}
}
