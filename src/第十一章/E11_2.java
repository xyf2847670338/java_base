package ��ʮһ��;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class E11_2 {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[]buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		System.out.println("�ȴ���������");
		while (true) {
			server.receive(packet);
			String str=new String(packet.getData(),0,
					packet.getLength());
			System.out.println(packet.getAddress()+":"
					+packet.getPort()+"������Ϣ:"+str);
			
		}

	}

}
