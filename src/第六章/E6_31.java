package 第六章;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import javax.naming.LimitExceededException;

public class E6_31 {
	public static void main(String[] args) {
		List<String> list=new ArrayList<>();
		list.add("谭冲");
		list.add("田松源");
		list.add("张三");
		list.add("张晓珣");
		list.add("王荟");
		Stream<String>stream=list.stream();
		Stream<String>stream2=stream.filter(i->i.startsWith("张"));
		Stream<String>stream3=stream2.limit(2);
		stream3.forEach(j->System.out.println(j));
		System.out.println("=============");
		list.stream().filter(i->i.startsWith("张")).filter(i->i.length()>2)
				.limit(2)
				.forEach(j->System.out.println(j));
		Stream<String>stream4=Stream.of("张三","李四","张小珣","谭冲","田松源");
		List<String>list1=stream.filter(i->i.startsWith("张"))
				.collect(Collectors.toList());
		System.out.println(list1);
		Stream<String>tream2=Stream.of("张三","李四","张小珣","谭冲","田松源");
		String string=stream2.filter(i->i.startsWith("张"))
				.collect(Collectors.joining("and"));
		System.out.println(string);
	}
}
