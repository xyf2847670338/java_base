package µÚÆßÕÂ;

import java.io.File;
import java.io.FileDescriptor;

public class E7_15 {
	public static void main(String[] args) {
		File file=new File("E:\\Java»ù´¡\\java_base\\java_base\\bin\\µÚÁùÕÂ");
		fileDir(file);
	}
	private static void fileDir(File file) {
		File[] listFiles=file.listFiles();
		for(File files:listFiles) {
			if(files.isDirectory()) {
				fileDir(files);
			}
			System.out.println(files);
		}
	}
}
