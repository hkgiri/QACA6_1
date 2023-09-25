package collection_list;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListToArrays {
	public static void main(String[] args) {
		ArrayList<Integer> ls=new ArrayList<>();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		ls.add(50);
		System.out.println(ls);

		//to convert ArrayList to Arrays
		Object[] oa = ls.toArray();
		for (Object obj : oa) {
			System.out.println(obj);
		}
	}

}

