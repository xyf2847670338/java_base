package ������;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class E7_17 {
	public static void main(String[] args) throws NumberFormatException, IOException {
		RandomAccessFile raf=new RandomAccessFile("D:\\time.txt","rw");
		int times=Integer.parseInt(raf.readLine())-1;
		if(times>0) {
			System.out.println("��������ʹ��"+times+"��");
			raf.seek(0);
			raf.write((times+"").getBytes());
		}else {
			System.out.println("���ô����Ѿ����꣡");
		}
		raf.close();
	}
}
