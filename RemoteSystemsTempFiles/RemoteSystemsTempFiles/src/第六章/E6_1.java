package ������;

import java.util.ArrayList;
import java.util.LinkedList;

import org.omg.CosNaming.IstringHelper;

public class E6_1 {
	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("s1");
		list.add("s2");
		list.add("s3");
		list.add("s4");
		System.out.println("���ϳ���"+list.size());
		System.out.println("�ڶ���Ԫ����"+list.get(1));
		
		LinkedList<String> list2=new LinkedList<String>();
		list2.add("s1");
		list2.add("s2");
		System.out.println(list2);
		list2.offer("offer");
		list2.push("push");
		System.out.println(list2);
		System.out.println("��һ��Ԫ����"+list2.get(0));
		System.out.println("��һ��Ԫ����"+list2.peek());
		list2.removeFirst();
		list2.pollLast();
		System.out.println(list2);
		
	}
}	

