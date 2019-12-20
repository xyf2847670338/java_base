package 第十一章;

import java.io.IOException;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class E11_7 {
	public static void main(String[] args) throws IOException, InterruptedException {
		ServerSocket serverSocket=new ServerSocket(7788);
		while(true){
			Socket client=serverSocket.accept();
			System.out.println("与客户端连接成功，开始进行数据交换!");
			OutputStream os=client.getOutputStream();
			os.write(("服务器端向客户端做出反应!").getBytes());
			Thread.sleep(5000);
			os.close();
			client.close();
		}
	}
}
