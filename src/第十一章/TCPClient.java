package ��ʮһ��;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

import com.mysql.fabric.xmlrpc.Client;

public class TCPClient {

	public static void main(String[] args) throws IOException {
		//�����ͻ����׽���,�����Ƿ�������IP��ַ�ͷ��������ŵĶ˿ںţ����ӷ�����
		Socket khdtjz=new Socket("10.2.103.31", 8899);
		//�����ļ�
		File wj=new File("d:\\1.jpg");
		//�����ļ��ֽ�����������������ļ�������Ϊ����
		FileInputStream fin=new FileInputStream(wj);
		//Ҫ���������������ݣ�����ͨ������õĿͻ����׽��ִ��������
		OutputStream os;
        //��ȡ�ֽ��������׼����������д����
		os = khdtjz.getOutputStream();
		byte[] zjhc=new byte[1024];
		int b=fin.read(zjhc);
		//ֱ���ļ�����
		while(b!=-1) {
			//д��������;
			os.write(zjhc,0,b);
			//�ٴζ�ȡ�ļ�
			b=fin.read(zjhc);
		}
		khdtjz.shutdownOutput();
		//�ͻ���Ҫ�������ݣ�ͨ���׽��ֻ�ȡ������
		InputStream is=khdtjz.getInputStream();
		zjhc=new byte[1024];
		b=is.read(zjhc);
		while(b!=-1) {
			//System.out.println(b);
			System.out.println(new String(zjhc,0,b));
			b=is.read(zjhc);
		}
		is.close();
		khdtjz.close();
	}

}
