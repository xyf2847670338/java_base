package ������;

import java.nio.CharBuffer;

public class E7_18 {
	public static void main(String[] args) {
		CharBuffer charBuffer=CharBuffer.allocate(6);
		System.out.println("����:"+charBuffer.capacity());
		System.out.println("������:"+charBuffer.limit());
		System.out.println("��ʼλ��:"+charBuffer.position());
		charBuffer.put('x');
		charBuffer.put('y');
		charBuffer.put('z');
		System.out.println("����Ԫ�غ�Ľ�����:"+charBuffer.limit());
		System.out.println("����Ԫ�غ��λ��:"+charBuffer.position());
		charBuffer.flip();
		System.out.println("ִ��flip()��Ľ���ֵ:"+charBuffer.limit());
		System.out.println("ִ��flip()���λ��:"+charBuffer.position());
		System.out.println("ȡ���ĵ�һ��Ԫ��:"+charBuffer.get());
		System.out.println("ȡ����Ľ���ֵ:"+charBuffer.limit());
		System.out.println("ȡ�����λ��:"+charBuffer.position());
		charBuffer.clear();
		System.out.println("ִ��clear()��Ľ���ֵ:"+charBuffer.limit());
		System.out.println("ִ��clear()���λ��:"+charBuffer.position());
		System.out.println("ȡ���ĵ�һ��Ԫ��Ϊ:"+charBuffer.get());
		System.out.println("ȡ����Ľ���ֵ:"+charBuffer.limit());
		System.out.println("ȡ�����λ��:"+charBuffer.position());
	}
}
