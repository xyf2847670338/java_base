package ������;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class E18 {
	public static void main(String[] args) {
		int num=123;
		String string=String.valueOf(num);
		System.out.println("��int������ת��Ϊ�ַ����Ľ��:"+string);
		String str="998";
		Integer integer=Integer.valueOf(num);
		Integer integer2=Integer.valueOf(str);
		System.out.println("��int����ת��Ϊ��װ��Ľ��:"+integer);
		System.out.println("���ַ�������ת��Ϊ��װ��Ľ��:"+integer2);
		Integer integer3=Integer.valueOf(num);
		Integer integer4=Integer.valueOf(str);
		System.out.println("ͨ����������int����ת��Ϊ��װ����:"+integer3);
		System.out.println("ͨ�����������ַ�������ת��Ϊ��װ����:"+integer4);
		int parseInt=Integer.parseInt(str);
		System.out.println("���ַ���ת��Ϊ�������͵Ľ��:"+parseInt);
		String string2=integer.toString();
		System.out.println("����װ��ת��Ϊ�ַ����Ľ��:"+string2);
	}
}
