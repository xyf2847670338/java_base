package ������;

import java.util.HashSet;

public class E6_9 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add("Jack");
		set.add("Eve");
		set.add("Rose");
		set.add("Rose");
		set.forEach(o->System.out.println(o));
	}
}
