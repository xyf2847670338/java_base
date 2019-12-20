package com.FunctionalInterface;

import java.text.ParseException;

@FunctionalInterface
interface Printable{
	void print(String str);
}
class StringUtils{
	public void printUpperCase(String str) {
		System.out.println(str.toUpperCase());
	}
}
public class E25{
	private static void printUpper(String text,Printable pt) {
		pt.print(text);
	}
	public static void main(String[] args) {
		StringUtils stu=new StringUtils();
		printUpper("Hello",t->stu.printUpperCase(t));
		printUpper("Hello",stu::printUpperCase);
	}
}