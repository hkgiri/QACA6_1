package collection_list;

import java.util.ArrayList;

public class ArrayToArrayList {
	public static void main(String[] args) {
		Integer[] a= {10,20,30,40,50};
		ArrayList li=tolist(a);
		System.out.println(li);
	}
	public static ArrayList tolist(Object[] o)
	{
		ArrayList ls=new ArrayList();
		for (Object obj : o) {
			ls.add(obj);
		}
		return ls;
	}
}
