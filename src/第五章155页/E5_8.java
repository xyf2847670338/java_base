package ������155ҳ;

import java.beans.DefaultPersistenceDelegate;

import javax.activation.UnsupportedDataTypeException;

import org.omg.CORBA.portable.Delegate;

public class E5_8 {
	public static void main(String[] args) {
		System.out.println("1.���------------------");
		add();
		System.out.println("2.�޸�------------------");
		update();
		System.out.println("3.ɾ��------------------");
		delete();
	}
	public static void add() {
		StringBuffer sb=new StringBuffer();
		sb.append("ABC");
		System.out.println("append��ӽ��:"+sb);
		sb.insert(3,"DE");
		System.out.println("insert��ӽ��:"+sb);
	}
	public static void update(){
		StringBuffer sb=new StringBuffer("ABAAA");
		sb.setCharAt(2,'C');
		System.out.println("�޸�ָ��λ���ַ����:"+sb);
		sb.replace(3,5,"DE");
		System.out.println("�滻ָ��λ���ַ����:"+sb);
		System.out.println("�ַ�����ת���:"+sb.reverse());
	}
	public static void delete() {
		StringBuffer sb=new StringBuffer("ABCDEFG");
		sb.delete(3,7);
		System.out.println("ɾ��ָ��λ�ý��:"+sb);
		sb.deleteCharAt(2);
		System.out.println("ɾ��ָ��λ�ý��:"+sb);
		sb.delete(0,sb.length());
		System.out.println("��ջ��������:"+sb);
	}
}
