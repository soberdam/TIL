package ch02.chatclient;

import java.awt.Color;
import java.awt.Frame;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.net.Socket;

public class ChatClient extends Frame implements Runnable, ActionListener {
	private String nickname = null;
	private String servAddr = null;
	private int servPort = 0;
	private boolean flag = false;
	private Socket socket = null;
	private BufferedReader br = null;
	private BufferedWriter bw = null;
	private TextField tf1 = new TextField();
	private TextArea ta1 = new TextArea();

	public ChatClient(String nickname, String servAddr, int servPort) throws IOException {
		this.nickname = nickname;
		this.servAddr = servAddr;
		this.servPort = servPort;
		this.initGraphics();
		this.initNetwork();
		new Thread(this).start();
	}
	
	
	
	public void initNetwork() throws IOException {
		this.socket = new Socket(servAddr, servPort);
		br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
		bw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
		this.sendMessage("[" + nickname + "] 님이 입장했습니다.");
	}



	public void initGraphics() {
		this.tf1.setBackground(Color.orange);
		this.ta1.setBackground(Color.yellow);
		this.add("North", tf1);
		this.add("Center", ta1);
		this.tf1.addActionListener(this);
		this.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0);
				stop();
			}

		});
	}

	public void stop() {
		this.sendMessage("");
		this.flag = true;
	}

	public void sendMessage(String msg) {
		try {
			this.bw.write(msg + "\n");
			this.bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		String msg = tf1.getText();
		if (!msg.equals("")) {
			this.sendMessage("[" + nickname + "]:" + msg);
			tf1.setText("");
		}

	}

	@Override
	public void run() {
		try {
			while (!flag) {
				String msg = br.readLine();
				if (msg != null && !msg.equals("")) {
					this.ta1.append(msg + "\n");
				} else {
					flag = true;
				}
			}
			br.close();
			bw.close();
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
