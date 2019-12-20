package 第十一章;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class E11_4 {

	public static void main(String[] args) {
		//创建Scanner对象，包装控制台输入
		Scanner sc=new Scanner(System.in);
		//提示用户输入聊天服务开启的端口号
		System.out.println("请输入聊天服务开启的端口号: ");
		//用Scanner对象接收用户的输入的整数，作为程序要开启的UDP端口号
		int serverport=sc.nextInt();
		System.out.println("请输入聊天服务发送信息对象的目标端口号:");
		int targetPort=sc.nextInt();
		System.out.println("聊天系统初始化完成并启动!!!");
		try {
			//创建聊天程序收发平台DatagramSocket对象
			DatagramSocket socket=new DatagramSocket(serverport);
			//分别启动信息接收端和发送端程序
			new Thread(new ChatReceiver(socket),"接收服务").start();
			new Thread(new ChatSend(socket,targetPort),"发送服务").start();	
		}catch(SocketException e) {
			e.printStackTrace();
		}
		}
	}
