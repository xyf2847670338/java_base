package ��ʮһ��;


import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {

	public static void main(String[] args) throws Exception {
		ServerSocket fwqtjz = new ServerSocket(8899);
		// ������ѭ����������Ӧ�ͻ��˵�����
		while (true) {

			// ͨ���������׽��ֻ�ȡ�ͻ����׽���
			Socket khdtjz = fwqtjz.accept();
			new Thread(() -> {
				try {
					// ��ȡ�ͻ��˵�ip��ַ
					String ip=khdtjz.getInetAddress().getHostAddress();
					// ��ȡ�ͻ��˵Ķ˿ں�
					int port = khdtjz.getPort();
					System.out.println("��˿ں�Ϊ" + port + "�Ŀͻ������ӳɹ�");
					
					
					// Ҫ�ӿͻ��˽����ļ�������ͨ������õĿͻ����׽��ִ���������
					InputStream is;
                    //��ȡ�ֽ��������׼����������д����
					is = khdtjz.getInputStream();
                    //��׼���ļ�
					File wj=new File("d:\\upload\\"+ip+".jpg");
					//�����ļ��ֽ����������������ļ�������Ϊ����
					FileOutputStream fout=new FileOutputStream(wj);
					byte[] zjhc=new byte[1024];
					int b=is.read(zjhc);
					//ֱ���������ݽ���
					while(b!=-1) {
						//д���ļ���;
						fout.write(zjhc,0,b);
						//�ٴ������ȡ��Ϣ
						b=is.read(zjhc);
					}
				
					
					
					
					// Ҫ���ͻ��˷������ݣ�����ͨ������õĿͻ����׽��ִ��������
					OutputStream os;
                    //��ȡ�ֽ��������׼����������д����
					os = khdtjz.getOutputStream();
					String s =ip+ "�ϴ��ɹ�";
					zjhc= s.getBytes();
					os.write(zjhc);
					Thread.sleep(5000);
					os.close();
					khdtjz.close();
				} catch (Exception e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}).start();

		}
	}
}
