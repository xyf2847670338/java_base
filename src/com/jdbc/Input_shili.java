package com.jdbc;

import java.io.File;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;

import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Input_shili {
	static Connection lianjie=null;
	public static void main(String[] args) throws Exception{
		Class.forName("com.mysql.jdbc.Driver");
		lianjie=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/jdbc?characterEncoding=UTF-8","root","123456");
		File mulu=new File("C:\\Users\\Administrator\\Desktop\\tice");
		File[]  files=mulu.listFiles();
		System.out.println("һ����"+files.length+"���ļ�");
		for (File file : files) {
			System.out.println(file);
			if(file.getName().endsWith("xlsx")) {
				dqbxrmgwj_xlsx(file);
			}
			else if(file.getName().endsWith("xls")) {
				dqbxrmgwj_xls(file);
			}
		}
	}
	private static void dqbxrmgwj_xls(File file) throws Exception {
		//excel�ļ�������
		FileInputStream fin=new FileInputStream(file);
		//���excel�ļ���workbook
		HSSFWorkbook workbook_in=new HSSFWorkbook(fin);
		//���workbook�ĵ�һ�����sheet1
		HSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//����������������
		int rows=sheet.getLastRowNum();
		for(int i=0;i<=rows;i++) {
			//��ȡ������ӵڶ��п�ʼ��ÿһ��
			HSSFRow row=sheet.getRow(i);
			//��ȡÿһ���еĵ��ĸ���Ԫ��
			HSSFCell cell=row.getCell(3);
			//�������Ԫ����ȡ���ַ���ֵ������xuehao������
			String xuehao=cell.getStringCellValue();
			//�ӵ�һ�п�ʼ�������ȡ�ĵ�Ԫ���ֵ�Ǳ����У�����Ҫ���£���������ѭ��
			if(xuehao.equals("ѧ��")) {
				continue;
			}
			HSSFCell cell20=row.getCell(19);
			HSSFCell cell21=row.getCell(20);
			if(cell20!=null&&cell21!=null) {
				//��ȡÿһ���еĵ�16����Ԫ��
				//�������Ԫ����ȡ���ַ���ֵ������z_shili������
				String z_shili=cell20.getStringCellValue();
				//��ȡÿһ���еĵ�17����Ԫ��
				//�������Ԫ����ȡ���ַ���ֵ������y_shili������
				String y_shili=cell21.getStringCellValue();
				//System.out.println(xuehao);
				//System.out.println(z_shili);
				//System.out.println(y_shili);
				//ע������
				//ͨ��������ȡ����
				Statement yuju=lianjie.createStatement();
				String sql="update sheet1 set `������������`='"+z_shili+"' where`ѧ��`='"+xuehao+"'";
				String sql1="update sheet1 set `������������`='"+y_shili+"' where`ѧ��`='"+xuehao+"'";
				yuju.executeUpdate(sql);
				yuju.executeUpdate(sql1);
			}
	}
	}
	private static void dqbxrmgwj_xlsx(File file) throws Exception {
		//excel�ļ�������
		FileInputStream fin=new FileInputStream(file);
		//���excel�ļ���workbook
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		//���workbook�ĵ�һ�����sheet1
		XSSFSheet sheet=workbook_in.getSheet("Sheet1");
		//����������������
		int rows=sheet.getLastRowNum();
		for(int i=0;i<=rows;i++) {
			//��ȡ������ӵڶ��п�ʼ��ÿһ��
			XSSFRow row=sheet.getRow(i);
			if(row==null) {
				System.out.println(file+"�ǿյ�");
				break;
			}
			//��ȡÿһ���еĵ��ĸ���Ԫ��
			XSSFCell cell=row.getCell(3);
			//�������Ԫ����ȡ���ַ���ֵ������xuehao������
			String xuehao=cell.getStringCellValue();
			//��ȡÿһ���еĵ�16����Ԫ��
			if(xuehao.equals("ѧ��")) {
				continue;
			}
			XSSFCell cell20=row.getCell(19);
			XSSFCell cell21=row.getCell(20);
			if(cell20!=null&&cell21!=null) {
			//�������Ԫ����ȡ���ַ���ֵ������z_shili������
			String z_shili=cell20.getStringCellValue();
			//��ȡÿһ���еĵ�17����Ԫ��
			//�������Ԫ����ȡ���ַ���ֵ������y_shili������
			String y_shili=cell21.getStringCellValue();
			//System.out.println(xuehao);
			//System.out.println(z_shili);
			//System.out.println(y_shili);
			//ע������
			//ͨ��������ȡ����
			
			PreparedStatement yudingyi_yuju=lianjie.prepareStatement("update sheet1 set'����������'=?,'����������'=? where'ѧ��'=?");
			//String sql="update sheet1 set `������������`='"+z_shili+"' where`ѧ��`='"+xuehao+"'";
			//String sql1="update sheet1 set `������������`='"+y_shili+"' where`ѧ��`='"+xuehao+"'";
			yudingyi_yuju.setString(1,z_shili);
			yudingyi_yuju.setString(2,z_shili);
			yudingyi_yuju.setString(3,z_shili);
			yudingyi_yuju.executeUpdate();
		}
	}
	}
}

