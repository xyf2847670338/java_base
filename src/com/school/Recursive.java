package com.school;

public class Recursive {
		public static int getSum(int n) {
			if(n==1)return 1;
			int temp=getSum(n-1);
			return n+temp;
		}
		public static void main(String[] args) {
			System.out.println("1��100�ĺ���"+getSum(100));
		}
}
