package 第五章;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class E19 {
	public static void main(String[] args) throws ParseException {
		Date date1=new Date();
		Date date2=new Date(System.currentTimeMillis()+1000);
		System.out.println(date1);
		System.out.println(date2);
		SimpleDateFormat sdf=new SimpleDateFormat("Gyyyy年MM月dd日HH分mm分55秒E");
		System.out.println(sdf.format(date1));
		Calendar rili=Calendar.getInstance();
		
		int nian=rili.get(Calendar.YEAR);
		int yue=rili.get(Calendar.MARCH)+1;
		int ri=rili.get(Calendar.DATE);
		System.out.println("今天是"+nian+"年"+yue+"月"+ri+"日");
		
		rili.set(nian, yue,ri);
		rili.add(Calendar.DATE,100);
		nian=rili.get(Calendar.YEAR);
		yue=rili.get(Calendar.MARCH);
		ri=rili.get(Calendar.DATE);
		System.out.println("100天后的今天是"+nian+"年"+yue+"月"+ri+"日");
		
		
		System.out.println("100天以后是"+nian+"年"+yue+"月"+ri+"日");
		
		LocalDate dqrq=LocalDate.now();
		LocalDate J_100=dqrq.plusDays(100);
		System.out.println(J_100);
		
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy-MM-dd");
		String ybtyh_zfc=J_100.toString();
		Date date_100=sdf1.parse(ybtyh_zfc);
		SimpleDateFormat sdf2=new SimpleDateFormat("yyyy年MM月dd日");
		System.out.println("100天以后是"+sdf2.format(date_100));
	}
}
