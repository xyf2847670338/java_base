package com.inner_class;
class Outer{
	static int m=0;
	void test1() {
		System.out.println("�ⲿ���Ա����");
	}
	void test2() {
		class Inner{
			int n=1;
			void show() {
				System.out.println("�ⲿ�����m="+m);
				test1();
			}
		}
		Inner inner=new Inner();
		System.out.println("�ֲ��ڲ������n="+inner.n);
		inner.show();
	}
	static class Inner{
		void show() {
			System.out.println("�ⲿ��ı���m="+m);
		}
	}
}
public class E19 {
	public static void main(System[] args) {
		Outer outer=new Outer();
		outer.test2();
		Outer.Inner inner=new Outer.Inner();
		inner.show();
	}
}