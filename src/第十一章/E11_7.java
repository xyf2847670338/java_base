package ��ʮһ��;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class E11_7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket serverSocket=new ServerSocket(7788);
		while(true){
			Socket client=serverSocket.accept();
			System.out.println("��ͻ������ӳɹ�����ʼ�������ݽ���!");
			OutputStream os=client.getOutputStream();
			os.write(("����������ͻ���������Ӧ!").getBytes());
			Thread.sleep(5000);
			os.close();
			client.close();
		}
	}
}
