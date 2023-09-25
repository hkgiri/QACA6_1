package arrays_list;

import java.util.ArrayList;

public class A2 {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		System.out.println(al);
		
		Object[] o=al.toArray();
		int[] a= new int[o.length];
		for (int i = 0; i < o.length; i++) {
			a[i] = (int) o[i];
			
		}
		for (int i : a) {
			System.out.println(i);
		}
	}
}
