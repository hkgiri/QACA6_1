package collection_set;

import java.util.ArrayList;
import java.util.HashSet;

//Convert a list into a Set. or remove all the duplicate element present inside list.
public class HS3 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add("Ram");
		ls.add(40);
		ls.add(20);
		ls.add("Ram");
		System.out.println(ls);
		
		//to remove the duplicate or to convert to Set.
		HashSet set=new HashSet(ls);
		System.out.println(set);
	}
}
/*
 o/p-
[10, 20, 30, 40, 20, 30]
[20, 40, 10, 30]
*/