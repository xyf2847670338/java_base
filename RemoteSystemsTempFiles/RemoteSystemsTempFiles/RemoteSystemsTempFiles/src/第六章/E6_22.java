package ������;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class E6_22 {
	public static void main(String[] args) throws Exception {
		Properties PPs=new Properties();
		PPs.load(new FileInputStream("E:\\Java����\\java_base\\java_base\\src\\������\\test.properties"));
		PPs.forEach((k,value)->System.out.println(k+"="+value));
		FileOutputStream out=new FileOutputStream("E:\\Java����\\java_base\\java_base\\src\\������\\test.properties");
		PPs.setProperty("charset","UTF-8");
		PPs.store(out,"����charset����");
	}
}
