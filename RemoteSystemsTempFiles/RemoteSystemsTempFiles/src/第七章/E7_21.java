package ������;



import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.List;

public class E7_21 {
	public static void main(String[] args) throws IOException {
		Path directoryPath=Paths.get("D:\\test\\sample");
		Files.createDirectories(directoryPath);
		System.out.println("Ŀ¼�����ɹ�!");
		Path filePath=Paths.get("D:\\test\\sample\\test.txt");
		Files.createFile(filePath);
		List<String>list=new ArrayList<String>();
		list.add("����һ�������ļ�");
		Files.write(filePath,list,StandardOpenOption.APPEND);
		List<String>lines=Files.readAllLines(filePath);
		System.out.println("�ļ��Ĵ�СΪ:"+Files.size(filePath));
		System.out.println("�ļ��е�����Ϊ:"+lines);
	}
}
