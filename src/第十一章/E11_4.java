package ��ʮһ��;

import java.net.DatagramSocket;
import java.net.SocketException;
import java.util.Scanner;

public class E11_4 {

	public static void main(String[] args) {
		//����Scanner���󣬰�װ����̨����
		Scanner sc=new Scanner(System.in);
		//��ʾ�û���������������Ķ˿ں�
		System.out.println("����������������Ķ˿ں�: ");
		//��Scanner��������û����������������Ϊ����Ҫ������UDP�˿ں�
		int serverport=sc.nextInt();
		System.out.println("�����������������Ϣ�����Ŀ��˿ں�:");
		int targetPort=sc.nextInt();
		System.out.println("����ϵͳ��ʼ����ɲ�����!!!");
		try {
			//������������շ�ƽ̨DatagramSocket����
			DatagramSocket socket=new DatagramSocket(serverport);
			//�ֱ�������Ϣ���ն˺ͷ��Ͷ˳���
			new Thread(new ChatReceiver(socket),"���շ���").start();
			new Thread(new ChatSend(socket,targetPort),"���ͷ���").start();	
		}catch(SocketException e) {
			e.printStackTrace();
		}
		}
	}
