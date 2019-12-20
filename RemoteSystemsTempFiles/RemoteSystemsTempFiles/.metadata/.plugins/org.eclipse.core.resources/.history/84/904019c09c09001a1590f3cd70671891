package µÚÆßÕÂ;

import java.io.File;
import java.util.Arrays;

public class E7_13 {
	public static void main(String[] args) {
		File file=new File("E:\\Java»ù´¡");
		if (file.isDirectory()) {
			String[] fileNames=file.list((dir,name)->name.endsWith(".java"));
			Arrays.stream(fileNames).forEach(f->System.out.println(f));
		}
	}
}
