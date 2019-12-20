package ������;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E7_4 {
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("D:\\src.jpg");
		FileOutputStream out=new FileOutputStream("D:\\dest.jpg");
		int len=0;
		long beginTime=System.currentTimeMillis();
		while((len=in.read())!=-1) {
			out.write(len);
		}
		long endTime=System.currentTimeMillis();
		System.out.println("����ʱ��Ϊ:"+(endTime-beginTime)+"����");
		in.close();
		out.close();
	}
}
