package collection_set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

//wajp to sort the Elements in Decending order.
public class HS4 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(40);
		set.add(30);
		System.out.println(set);
		
		//to convert TreeSet List
		ArrayList ls=new ArrayList(set);
		System.out.println(ls);
		
		//to Sort the Elements
		Collections.sort(ls);
		 System.out.println("Sorted collection "+ls);
		 
		//to reverse the elements 
		Collections.reverse(ls);
		System.out.println("reverse collection "+ls);
	}
}
