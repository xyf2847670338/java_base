

package ตฺม๙ีย;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;


public class E6_15 {
	public static void main(String[] args) {
		Map map=new HashMap();
		map.put("1", "Jack");
		map.put("2", "Rose");
		map.put("3", "Lucy");
		System.out.println(map);
		Set entrySet=map.entrySet();
		Iterator it=entrySet.iterator();
		while(it.hasNext()){
			Map.Entry entry=(Map.Entry)(it.next());
			Object key=entry.getKey();
			Object value=entry.getValue();
			System.out.println(key+":"+value);
		}
	}
}
