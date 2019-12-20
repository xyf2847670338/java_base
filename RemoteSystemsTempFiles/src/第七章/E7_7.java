package µÚÆßÕÂ;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class E7_7 {
	public static void main(String[] args) throws IOException {
		FileReader fileReader=new FileReader("d:\\reader.txt");
		int len=0;
		while((len=fileReader.read())!=-1) {
			System.out.print((char)len);
		}
		fileReader.close();
	}
}
