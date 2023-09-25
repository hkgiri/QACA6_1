package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Iterator1 {

	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		System.out.println(ls);
		
		//to access the elements using iterator
		Iterator i=ls.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
	}
}
