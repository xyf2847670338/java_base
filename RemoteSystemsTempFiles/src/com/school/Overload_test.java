package com.school;

public class Overload_test{
	public static void main(String[] args) {
		//���һ�������Ǿ�̬����������ֱ��������������
		System.out.println(Overload.add(3,5));
		System.out.println(Overload.add(3,5,6));
		//���ܷ����ǲ��Ǿ�̬�ģ��������ö�����������
		Overload o1=new Overload();
		System.out.println(o1.add(3.1,5.2));
	}
}
