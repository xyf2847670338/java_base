package ������;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class E6_25 {
	public static void main(String[] args) {
		ArrayList<String>list=new ArrayList<>();
		Collections.addAll(list,"C","Z","B","K");
		System.out.println("����ǰ:"+list);
		Collections.reverse(list);
		System.out.println("��ת��:"+list);
		Collections.sort(list);
		System.out.println("����Ȼ˳�������:"+list);
		Collections.shuffle(list);
		System.out.println("�����˳�������:"+list);
		Collections.swap(list,0,list.size()-1);
		System.out.println("������βԪ�ؽ�����:"+list);
	}
}
