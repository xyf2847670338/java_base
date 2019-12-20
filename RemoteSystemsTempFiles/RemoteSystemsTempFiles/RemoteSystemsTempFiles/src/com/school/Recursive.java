package com.school;

public class Recursive {
		public static int getSum(int n) {
			if(n==1)return 1;
			int temp=getSum(n-1);
			return n+temp;
		}
		public static void main(String[] args) {
			System.out.println("1到100的和是"+getSum(100));
		}
}
