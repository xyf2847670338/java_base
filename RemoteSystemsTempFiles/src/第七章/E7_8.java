package ������;

import java.io.FileWriter;
import java.io.IOException;

public class E7_8 {
	public static void main(String[] args) throws IOException {
		FileWriter fileWriter=new FileWriter("d:\\writer.txt");
		fileWriter.write("�����������,\r\n");
		fileWriter.write("�������������,\r\n");
		fileWriter.write("�����������,\r\n");
		fileWriter.write("�������ߵ��Ʋ�,\r\n");
		fileWriter .close();
	}
}
