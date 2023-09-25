package collection_list;

import java.util.ArrayList;

// Can we Convert on ArrayList into an Array?
public class A_to_AL {
	public static ArrayList toList(Object[] o)
	{
		ArrayList ls=new ArrayList();
		for (Object obj : o) {
			ls.add(obj);
		}
		return ls;
	}
	public static void main(String[] args) {
		Integer[] a= {10,20,30,40};
		ArrayList al=toList(a);
		System.out.println(al);
	}
}
