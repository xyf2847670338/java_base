package com.jdbc;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class Shili_input {
	public static void main(String[] args) throws Exception {
		//excel�ļ�������
		FileInputStream fin=new FileInputStream("shili.xlsx");
		//���excel�ļ���workbook
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		//���workbook�ĵ�һ�����sheet1
		XSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//����������������
		int rows=sheet.getLastRowNum();
		for(int i=1;i<rows;i++) {
			//��ȡ������ӵڶ��п�ʼ��ÿһ��
			XSSFRow row=sheet.getRow(i);
			//��ȡÿһ���еĵ��ĸ���Ԫ��
			XSSFCell cell=row.getCell(3);
			//�������Ԫ����ȡ���ַ���ֵ������xuehao������
			String xuehao=cell.getStringCellValue();
			//��ȡÿһ���еĵ�16����Ԫ��
			XSSFCell cell16=row.getCell(15);
			//�������Ԫ����ȡ���ַ���ֵ������z_shili������
			String z_shili=cell16.getStringCellValue();
			//��ȡÿһ���еĵ�17����Ԫ��
			XSSFCell cell17=row.getCell(16);
			//�������Ԫ����ȡ���ַ���ֵ������y_shili������
			String y_shili=cell17.getStringCellValue();
			System.out.println(xuehao);
			System.out.println(z_shili);
			System.out.println(y_shili);
			//ע������
			Class.forName("com.mysql.jdbc.Driver");
			Connection lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/xyf?characterEncoding=UTF-8","root","123456");
			//ͨ��������ȡ����
			Statement yuju=lianjie.createStatement();
			String sql="update 18rj1 set `������������`='"+z_shili+"' where`ѧ��`='"+xuehao+"'";
			String sql1="update 18rj1 set `������������`='"+y_shili+"' where`ѧ��`='"+xuehao+"'";
			System.out.println(sql);
			yuju.execute(sql);
			yuju.execute(sql1);
		}
	}
	
}

