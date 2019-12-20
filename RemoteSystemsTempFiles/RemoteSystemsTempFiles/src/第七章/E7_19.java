package 第七章;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;

import javax.print.attribute.Size2DSyntax;

public class E7_19 {
	public static void main(String[] args) throws IOException {
		RandomAccessFile inFile=new RandomAccessFile("source/src.jpg", "rw");
		FileChannel inChannel=inFile.getChannel();
		RandomAccessFile outfile=new RandomAccessFile("target/dest.jpg","rw");
		FileChannel outChannel=outfile.getChannel();
		long transferTo=inChannel.transferTo(0,inChannel.size(),outChannel);
		if(transferTo>0) {
			System.out.println("复制成功");
		}
		inFile.close();
		inChannel.close();
		outfile.close();
		outChannel.close();
	}
}
