package 第六章;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Properties;

public class E6_22 {
	public static void main(String[] args) throws Exception {
		Properties PPs=new Properties();
		PPs.load(new FileInputStream("E:\\Java基础\\java_base\\java_base\\src\\第六章\\test.properties"));
		PPs.forEach((k,value)->System.out.println(k+"="+value));
		FileOutputStream out=new FileOutputStream("E:\\Java基础\\java_base\\java_base\\src\\第六章\\test.properties");
		PPs.setProperty("charset","UTF-8");
		PPs.store(out,"新增charset编码");
	}
}
