package ��ʮһ��;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class E11_1 {

	public static void main(String[] args) throws Exception {
	InetAddress localAddress=InetAddress.getLocalHost();
	InetAddress remoteAddress=
			  localAddress.getByName("www.itcast.com");
	System.out.println("������IP��ַΪ:"+localAddress.getHostAddress());
	System.out.println("itcast��IP��ַΪ:"+remoteAddress.getHostAddress());
	System.out.println("3�����Ƿ���Է���:"+remoteAddress.isReachable(3000));
	System.out.println("itcast��������Ϊ:"+remoteAddress.getHostName());
	}
}
