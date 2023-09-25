package collection_map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

import collection_list.Iterator1;

public class HM1 {
	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap();
		map.put("fruit", "Mango");
		map.put("vegetable", "califlower");
		map.put("dryfruit","cajus");
		map.put("oilfruit","coconut");
		System.out.println(map);
		
		//to access the entries
		System.out.println(map.get("fruit"));
		
		//to access all the entries
		 Set entries = map.entrySet();
		for (Object obj :entries ) {
			System.out.println(obj);
		}
		//use access using iterator
		Iterator i=entries.iterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		//to access all the values of map using keys
		Set s=map.entrySet();
		Iterator i1=s.iterator();
		while (i1.hasNext()) {
			Object a =i1.next();
			System.out.println(a+":"+map.get(a));
		}
		
	}
}
