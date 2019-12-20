package µÚÆßÕÂ;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E7_10 {
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("d:\\reader.txt"));
		BufferedWriter bW=new BufferedWriter(new FileWriter("d:\\writer.txt"));
		String str=null;
		while((str=br.readLine())!=null) {
			bW.write(str);
			bW.newLine();
		}
		br.close();
		bW.close();
	}
}
