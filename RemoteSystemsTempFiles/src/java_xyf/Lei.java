package java_xyf;

	import java.io.Serializable;
	
public class Lei {
	//����3���ڲ���
	//���η�+class+������ʾ��+extends(�̳йؼ���) �����ʾ��+implements(ʵ�ֹؼ���)
	//��һ�����η���ʾ���÷�Χ��public���е� proteted�ܱ�����   private˽�е�
	//�ڶ������η���ʾ�ض����ܣ�static��̬��  final���յ�(����û������) synchronizedͬ����
	public 		static final class	A extends Object implements Serializable{}
	protected 	static final class	B extends Object implements Serializable{}
				static final class	C extends Object implements Serializable{}
	private 	static final class	D extends Object implements Serializable{}
	//	����2����Ա����
	private static  int age=0;
	private static  String name="";
	//����������Ա����//
	//������ǰǰ���������η�����ʡ�ԣ���������ǰ����з���ֵ���ͣ�����ʡ�ԣ�
	//����ֵ����Ϊvoid��ʾ�գ��������ڲ���Ҫreturn���
	//�������͵ķ���ֵ����������Ҫreturn���
	//�����������ȸ�һ��С���ţ��ڸ�һ�Դ�����
	//�����������һ��С��������԰�����������ʽ�ǣ��������� ������
	void setAge(int nianling) {
		age=nianling;
	}
	public int getAge() {
		return age;
	}
	//private default protected public;
	//
}
