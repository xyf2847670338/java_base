package ��ʮһ��;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class E11_3 {
	public static void main(String[] args) throws IOException {
		DatagramSocket client=new DatagramSocket(3000);
		String str="����лҫ����ʺ�";
		byte[] hcqsz=str.getBytes("UTF-8");
		DatagramPacket packet=new DatagramPacket(hcqsz,hcqsz.length,InetAddress.getByName("10.2.103.30"),8900);
		System.out.println("��ʼ������Ϣ.....");
		client.send(packet);
		client.close();
	}
}
