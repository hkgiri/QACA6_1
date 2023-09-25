package arrays_list;

import java.util.ArrayList;

public class A1 {
	public static void main(String[] args) {
		int[] a={10,20,30,40};
		ArrayList al=new ArrayList();
		for (Object obj : a) {
			al.add(obj);
		}
		System.out.println(al);
	}
}
