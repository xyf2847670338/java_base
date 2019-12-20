package ตฺม๙ีย;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

class CustomComparator implements Comparator{
	public int compare(Object obj1,Object obj2) {
		String key1=(String)obj1;
		String key2=(String)obj2;
		return key2.compareTo(key1);
	}
}
public class E6_20 {
	public static void main(String[] args) {
		Map map=new TreeMap(new CustomComparator());
		map.put("2","Rose");
		map.put("1","Jack");
		map.put("3","Lucy");
		System.out.println(map);
	}
}
