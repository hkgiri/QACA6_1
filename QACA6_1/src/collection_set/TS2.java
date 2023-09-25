package collection_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

//wajp to sort the Elements in Decending order.
public class TS2 {
	public static void main(String[] args) {
		TreeSet set=new TreeSet();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		System.out.println(set);
		
		//to convert TreeSet List
		ArrayList ls=new ArrayList(set);
		System.out.println(ls);
		 
		//to reverse the elements 
		Collections.reverse(ls);
		System.out.println(ls);
	}
}
