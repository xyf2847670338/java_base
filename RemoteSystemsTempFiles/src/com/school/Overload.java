package com.school;

public class Overload {
	public static int add(int x,int y) {
		return x+y;
	}
	public static int add(int x,int y,int z) {
		return x+y;
	}
	public static double add(double x,double y) {
		return x+y;
	}
	public static void main(String[]args) {
		int sum1=add(1, 2);
		int sum2=add(3, 4,7);
		double sum3=add(0.2, 5.3);
		System.out.println("sum1="+sum1);
		System.out.println("sum2="+sum2);
		System.out.println("sum3="+sum3);
	}
}
