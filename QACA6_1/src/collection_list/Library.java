package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

public class Library {
	ArrayList al=new ArrayList();

	public void addBook(Book1 b) {
		al.add(b);
	}
	public void removeBook(int bid) {
		Iterator i=al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if (b1.bid==bid) {
				System.out.println("Remove The Book");
				System.err.println(b1);
				i.remove();
			}
		}
	}
	public void removeBook(String name) {
		Iterator i=al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if (b1.name.equalsIgnoreCase(name)) {
				System.out.println("Remove The Book");
				System.err.println(b1);
				i.remove();
			}
		}

	}
	public void removeBook(double price) {
		Iterator i=al.iterator();
		while (i.hasNext()) {
			Object o = i.next();
			Book1 b1=(Book1)o;
			if (b1.price==price) {
				System.out.println("Remove The Book");
				System.err.println(b1);
				i.remove();
			}
		}

	}

}
