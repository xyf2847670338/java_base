package 第六章;

import java.util.TreeSet;

public class E6_11 {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet<>();
		ts.add(3);
		ts.add(9);
		ts.add(1);
		ts.add(21);
		System.out.println("创建TreeSet集合为:"+ts);
		System.out.println("TreeSet集合首元素为:"+ts.first());
		System.out.println("TreeSet集合尾部元素为:"+ts.last());
		System.out.println("集合中大小和等于9的最大的一个元素为:"+ts.floor(9));
		System.out.println("集合中大小和等于10的最大的一个元素为:"+ts.higher(10));
		System.out.println("集合中大小和等于100的最大的一个元素为:"+ts.higher(100));
		Object first=ts.pollFirst();
		System.out.println("删除的第一个元素是:"+first);
		System.out.println("删除的第一个元素后TreeSet集合变为:"+ts);
	}
}
