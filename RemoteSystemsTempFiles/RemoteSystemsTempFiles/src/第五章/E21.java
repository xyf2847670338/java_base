package ������;

import java.util.Calendar;

public class E21 {
	public static void main(String[] args) {
		Calendar calendar=Calendar.getInstance();
		calendar.set(2019,10,15);
		calendar.add(Calendar.DATE,100);
		int year=calendar.get(Calendar.DATE);
		int month=calendar.get(Calendar.MONTH);
		int date =calendar.get(Calendar.DATE);
		System.out.println("�ƻ���������Ϊ:"+year+"��"+month+"��"+date+"��");
	}
}
