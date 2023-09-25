package collection_list;

import java.util.ArrayList;

public class For_Each2 {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add("Sheela");
		ls.add("Leela");
		ls.add("Mala");
		ls.add("Urmila");
		for (Object o : ls) {
			String s=(String)o;
			System.out.println(s+" it's length: "+s.length());
		}
		
	}
}
