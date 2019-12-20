package 第十一章;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class E11_2 {

	public static void main(String[] args) throws Exception {
		DatagramSocket server=new DatagramSocket(8900);
		byte[]buf=new byte[1024];
		DatagramPacket packet=new DatagramPacket(buf, buf.length);
		System.out.println("等待接收数据");
		while (true) {
			server.receive(packet);
			String str=new String(packet.getData(),0,
					packet.getLength());
			System.out.println(packet.getAddress()+":"
					+packet.getPort()+"发送消息:"+str);
			
		}

	}

}
