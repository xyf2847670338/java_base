package ������;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.naming.LimitExceededException;

public class E6_31 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("̷��");
		list.add("����Դ");
		list.add("����");
		list.add("������");
		list.add("����");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("��"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=============");
		list.stream().filter(i->i.startsWith("��")).filter(i->i.length()>2)
				.limit(2)
				.forEach(j->System.out.println(j));
		Stream<String>stream4=Stream.of("����","����","��С��","̷��","����Դ");
		List<String>list1=stream.filter(i->i.startsWith("��"))
				.collect(Collectors.toList());
		System.out.println(list1);
		Stream<String>tream2=Stream.of("����","����","��С��","̷��","����Դ");
		String string=stream2.filter(i->i.startsWith("��"))
				.collect(Collectors.joining("and"));
		System.out.println(string);
	}
}
