package collection_list;

import java.util.ArrayList;

public class AL_to_A2 {
	public static Object[] conarrays(ArrayList a)
	{
		//to Convert it to Arrays.
		Object[] o=a.toArray();
		return o;
	}
	
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add(40);
		Object[] ai = AL_to_A2.conarrays(ls);
		//to print the Arrays.
		for (Object obj : ai) {
			System.out.println(obj);
		}
		
		}
	}

