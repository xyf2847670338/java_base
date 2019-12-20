package 第七章;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class Shili_input {
	public static void main(String[] args) throws Exception{
		FileInputStream fin=new FileInputStream("D:\\18软件1 不要删 谢谢\\java\\shili.xlsx");
		XSSFWorkbook workbook_in=new XSSFWorkbook(fin);
		XSSFSheet sheet =workbook_in.getSheet("Sheet1");
		int rows=sheet.getLastRowNum();
		System.out.println(rows);
		if(rows==0){
			throw new RuntimeException( "表格中没有数据...");
		}
		XSSFRow rowi=null;//
		Iterator<Cell> cell_jihe=null;
		ArrayList list=new ArrayList();
		Map map=new HashMap<>();
		for (int i = 0; i <=rows; i++) {
			rowi=sheet.getRow(i);
			cell_jihe=rowi.cellIterator();
			list =new ArrayList();
			while (cell_jihe.hasNext()) {
				Cell cell=(Cell) cell_jihe.next();
				if (cell.getCellType()==CellType.NUMERIC) {
					list.add(cell.getNumericCellValue());
				}else if (cell.getCellType()==CellType.STRING) {
					list.add(cell.getStringCellValue());
				}
			}
			map.put(list.get(3), list);
		}
		FileInputStream fin_dext=new FileInputStream("D:\\18软件1 不要删 谢谢\\java18rj1.xlsx");
		XSSFWorkbook workbook_in_dext=new XSSFWorkbook(fin_dext);
		XSSFSheet sheet_dext =workbook_in_dext.getSheet("Sheet1");
		int rows_dext=sheet_dext.getLastRowNum();
		System.out.println(rows_dext);
		if(rows_dext==0){
			throw new RuntimeException( "表格中没有数据...");
		}
		XSSFRow rowi_dext=null;
		
		for (int i = 0; i <=rows_dext; i++) {
			rowi_dext=sheet_dext.getRow(i);
			String xuehao=rowi_dext.getCell(3).getStringCellValue();
			ArrayList tcxxjh=(ArrayList)map.get(xuehao);
			
			System.out.println(tcxxjh);
			if (tcxxjh!=null) {
				rowi_dext.createCell(15).setCellValue(tcxxjh.get(11).toString());
			    rowi_dext.createCell(16).setCellValue(tcxxjh.get(12).toString());
			}
			
		}
		FileOutputStream fout=new FileOutputStream("18rj1.xlsx");
		workbook_in_dext.write(fout);
		fout.close();
		System.out.println(list);
	}
}
