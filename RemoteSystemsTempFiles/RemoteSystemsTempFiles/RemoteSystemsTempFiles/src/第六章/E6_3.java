package ตฺม๙ีย;

import java.util.ArrayList;
import java.util.Iterator;

public class E6_3 {
	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("data_1");
		list.add("data_2");
		list.add("data_3");
		Iterator iterator=list.iterator();
		while(iterator.hasNext()){
		Object obj=iterator.next();
		System.out.println(obj);
	}
}
}
