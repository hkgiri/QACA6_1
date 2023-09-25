package collection_set;

import java.util.Iterator;
import java.util.TreeSet;

//reverse the elements in descending order without using descendingset().
public class TS4 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(20);
		set.add(30);
		set.add(10);
		set.add(40);
		System.out.println(set);
		
		//to access the Elements and reverse the Elements
		Iterator i=set.descendingIterator();
		while (i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
}
/*
[10, 20, 30, 40]
40
30
20
10
*/