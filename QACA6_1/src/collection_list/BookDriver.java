package collection_list;

import java.util.ArrayList;

public class BookDriver {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Book1(1, "Manual",300));
		al.add(new Book1(2,"SQL",200));
		al.add(new Book1(3, "Java",500));
		al.add(new Book1(3,"Selenium",400));
		al.add(new Book1(5,"Api",180));
		int size = al.size();
		for (int i = 0; i < size; i++) {
			Object o = al.get(i);
			Book1 b1=(Book1)o;
			b1.display();
		}
	}
}
