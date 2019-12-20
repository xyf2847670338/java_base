package com.FunctionalInterface;
@FunctionalInterface
interface Animal{
	void shout();
}


@FunctionalInterface
interface Calculate{
	int sum(int a,int b);
}

public class E23{
	public static void main(String[] args) {
		
		abimalShout(()->System.out.println("bbbb"));
		showSum(10,20,(x,y)->x+y);
	}
	private static void showSum(int i, int j, Calculate c) {
		
	}
	private static void abimalShout(int x,int y,Calculate c){
		System.out.println(x+"+"+y+"µÄºÍÊÇ"+c.sum(x,y));
	}
	private static void abimalShout(Animal an) {
		an.shout();
	}
}
