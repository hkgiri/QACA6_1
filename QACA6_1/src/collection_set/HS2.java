package collection_set;

import java.util.ArrayList;
import java.util.HashSet;

//convert a set into a List
public class HS2 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		
		//to convert HashSet to List.
		ArrayList ls=new ArrayList(set);
		System.out.println(ls);
	}
}

/*
[20, 40, 10, 30]
[20, 40, 10, 30]
*/