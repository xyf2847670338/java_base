package ������;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;

public class Sc_excel {
	public static void main(String[] args) throws IOException {
		HSSFWorkbook wb=new HSSFWorkbook();
		HSSFSheet sheet=wb.createSheet("����ģ��");


		HSSFRow row0=sheet.createRow(0);
		HSSFCell cell0=row0.createCell(0);
		cell0.setCellValue("�꼶");
		row0.createCell(1).setCellValue("�༶���");
		row0.createCell(2).setCellValue("�༶����");
		row0.createCell(3).setCellValue("��Ŀ����");
		row0.createCell(4).setCellValue("������ʦ");
		row0.createCell(5).setCellValue("����ʱ��");
		row0.createCell(6).setCellValue("���Եص�");
		row0.createCell(7).setCellValue("��������");
		row0.createCell(8).setCellValue("���Է���(�ֹ�/����)");
		
		Path wj=Paths.get("D:\\18���1 ��Ҫɾ лл//�༶��Ϣ.xls");
		List<String>  lines=Files.readAllLines(wj);
		int j=0;
		for(String line:lines) {
			String[] zfcsz=line.split("	");
			for(int i=j*10+1; i<j*10+11; i++) {
			HSSFRow rowi=sheet.createRow(i);
			rowi.createCell(0).setCellValue("18");
			rowi.createCell(1).setCellValue(zfcsz[0]);
			rowi.createCell(2).setCellValue(zfcsz[1]);


			if(i%10==1) {
					rowi.createCell(3).setCellValue("���");
					rowi.createCell(4).setCellValue("�߼���");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				if(i%10==2) {
					rowi.createCell(3).setCellValue("����");
					rowi.createCell(4).setCellValue("�����");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				if(i%10==3) {
					rowi.createCell(3).setCellValue("�λ���");
					rowi.createCell(4).setCellValue("��ѩ��֮/������");
					rowi.createCell(5).setCellValue("2019/11/9");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				if(i%10==4) {
					rowi.createCell(3).setCellValue("50����");
					rowi.createCell(4).setCellValue("������/���÷");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}


				if(i%10==5) {
					rowi.createCell(3).setCellValue("������Զ");
					rowi.createCell(4).setCellValue("�����/ФԽ");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
				}
			  if(i%10==6) {
					rowi.createCell(3).setCellValue("��λ��ǰ��");
					rowi.createCell(4).setCellValue("¬Ԩ��/�ܾ�");
					rowi.createCell(5).setCellValue("2019/11/9");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
			  }
				if(i%10==7) {
					rowi.createCell(3).setCellValue("1000����");
					rowi.createCell(4).setCellValue("������/������");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				if(i%10==8) {
					rowi.createCell(3).setCellValue("��������");
					rowi.createCell(4).setCellValue("���¾�/÷���");
					rowi.createCell(5).setCellValue("2019/11/9");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("1");
				}
				if(i%10==9) {
					rowi.createCell(3).setCellValue("800����");
					rowi.createCell(4).setCellValue("����");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
				if(i%10==0) {
					rowi.createCell(3).setCellValue("һ������������");
					rowi.createCell(4).setCellValue("ë����/����Ө");
					rowi.createCell(5).setCellValue("2019/10/29");
					rowi.createCell(6).setCellValue("ѧԺ������");
					rowi.createCell(7).setCellValue("");
					rowi.createCell(8).setCellValue("2");
				}
		}
			j++;
		}



		FileOutputStream fout=new FileOutputStream("d:\\����ģ��.xls");
		wb.write(fout);
		fout.close();
	}
}
