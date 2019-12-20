package ������;

import java.awt.event.MouseWheelEvent;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class E7_11 {
	public static void main(String[] args) throws IOException {
		FileInputStream in=new FileInputStream("d:\\reader.txt");
		InputStreamReader isr=new InputStreamReader(in);
		BufferedReader br=new BufferedReader(isr);
		FileOutputStream out=new FileOutputStream("d:\\writer.txt");
		OutputStreamWriter osw=new OutputStreamWriter(out);
		BufferedWriter bw=new BufferedWriter(osw);
		String line=null;
		while((line=br.readLine())!=null) {
			bw.write(line);
			bw.newLine();
		}
		br.close();
		bw.close();
}
}
