package collection_list;

import java.util.ArrayList;

// Can we Convert on ArrayList into an Array?
public class AL_to_A {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		//to Convert it to Arrays.
		Object[] o=ls.toArray();
		System.out.println(o);//object address print 
		for (Object obj :o) {
			System.out.println(obj);
		}
	}
}
