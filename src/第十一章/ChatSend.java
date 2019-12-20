package ��ʮһ��;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ChatSend implements Runnable {
	private DatagramSocket client;
	private int targetPort;
	public ChatSend(DatagramSocket client, int targetPort) {
		this.client=client;
		this.targetPort=targetPort;
	}

	@Override
	public void run() {
		try {
			Scanner sc=new Scanner(System.in);
			while(true) {
				String 	data=sc.nextLine();
				byte[] buf=data.getBytes();
				DatagramPacket packet=new DatagramPacket(buf,buf.length,
						InetAddress.getByName("10.2.103.46"),targetPort);
				client.send(packet);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

}