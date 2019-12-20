package ตฺม๙ีย;

import java.util.ArrayList;

public class E6_23 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("String");
		list.add("Collection");
		list.add("1");
		for (Object obj:list) {
			String str=(String)obj;
			System.out.println(str);
		}
	}
}
