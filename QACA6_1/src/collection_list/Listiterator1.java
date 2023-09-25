package collection_list;

import java.util.ArrayList;
import java.util.ListIterator;

public class Listiterator1 {
	public static void main(String[] args) {
	ArrayList ls=new ArrayList();
	ls.add(10);
	ls.add(20);
	ls.add(30);
	ls.add(40);
	System.out.println(ls);
	
	//to access the element using Listiterator().
	ListIterator li=ls.listIterator();
	while(li.hasNext())
	{
		System.out.println(li.next());
	}
	//to access the elementin reverse direction.
	while(li.hasPrevious())
	{
		System.out.println(li.previous());
	}
	
	}
}
/*
o/p-
[10, 20, 30, 40]
10
20
30
40
40
30
20
10
*/
