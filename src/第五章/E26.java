package ������;

import java.text.SimpleDateFormat;
import java.util.Date;

public class E26 {
	public static void main(String[] args) {
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy��MM��dd��:������yyy��ĵ�D��,E");
		System.out.println(sdf.format(new Date()));
	}
}
