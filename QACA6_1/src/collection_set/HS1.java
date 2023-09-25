package collection_set;

import java.util.HashSet;

public class HS1 {
	public static void main(String[] args) {
		HashSet set=new HashSet();
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set.add(20));//false
		System.out.println(set.size());//4
		System.out.println(set);//[20,40,10,20]
		
	}
}
