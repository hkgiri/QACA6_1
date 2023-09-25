package collection_set;

import java.util.NavigableSet;
import java.util.TreeSet;

//reverse the elements of TreeSet without converting into List.
public class TS3 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(40);
		set.add(30);
		set.add(20);
		set.add(10);
		System.out.println(set);
		
		//to sort the elements in descending order or reverse the elements
		NavigableSet s=set.descendingSet();
		System.out.println(s);
	}
}
/*
[10, 20, 30, 40]
[40, 30, 20, 10]
*/
