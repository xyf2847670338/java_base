package ������;

import java.nio.file.Path;
import java.nio.file.Paths;

public class E7_20 {
	public static void main(String[] args) {
		Path path=Paths.get("D:\\test\\�ļ���\\test.txt");
		System.out.println("path�ĸ�·��:"+path.getRoot());
		System.out.println("path�ĸ�·��:"+path.getParent());
		System.out.println("path�е�·��������:"+path.getNameCount());
		for(int i=0;i<path.getNameCount();i++) {
			Path name=path.getName(i);
			System.out.println("����Ϊ"+i+"��·��������Ϊ:"+name);
		}
		System.out.println("path��URI·��Ϊ:"+path.toUri());
		System.out.println("path�ľ���·��:"+path.toAbsolutePath());
	}
}
