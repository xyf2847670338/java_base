package ������;

import java.io.File;

public class E7_12 {
	public static void main(String[] args) {
		File file=new File("example.txt");
		System.out.println("�ļ�����:"+file.getName());
		System.out.println("�ļ������·��:"+file.getPath());
		System.out.println("�ļ��ľ���·��:"+file.getAbsolutePath());
		System.out.println("�ļ��ĸ�·��:"+file.getParent());
		System.out.println(file.canRead()?"�ļ��ɶ�":"�ļ����ɶ�");
		System.out.println(file.canWrite()?"�ļ���д":"�ļ�����д");
		System.out.println(file.isFile()?"��һ���ļ�":"����һ���ļ�");
		System.out.println(file.isDirectory()?"��һ��Ŀ¼":"����һ��Ŀ¼");
		System.out.println(file.isAbsolute()?"�Ǿ���·��":"���Ǿ���·��");
		System.out.println("����޸�ʱ��Ϊ:"+file.lastModified());
		System.out.println("�ļ���СΪ:"+file.length()+"bytes");
		System.out.println("�Ƿ�ɹ�ɾ���ļ�"+file.delete());
	}
}
