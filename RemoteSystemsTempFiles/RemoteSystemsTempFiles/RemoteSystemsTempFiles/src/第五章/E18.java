package 第五章;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class E18 {
	public static void main(String[] args) {
		int num=123;
		String string=String.valueOf(num);
		System.out.println("将int比那辆转换为字符串的结果:"+string);
		String str="998";
		Integer integer=Integer.valueOf(num);
		Integer integer2=Integer.valueOf(str);
		System.out.println("将int变量转换为包装类的结果:"+integer);
		System.out.println("将字符串变量转换为包装类的结果:"+integer2);
		Integer integer3=Integer.valueOf(num);
		Integer integer4=Integer.valueOf(str);
		System.out.println("通过构造器将int变量转化为包装类结果:"+integer3);
		System.out.println("通过构造器将字符串变量转化为包装类结果:"+integer4);
		int parseInt=Integer.parseInt(str);
		System.out.println("将字符串转换为基本类型的结果:"+parseInt);
		String string2=integer.toString();
		System.out.println("将包装类转换为字符串的结果:"+string2);
	}
}
