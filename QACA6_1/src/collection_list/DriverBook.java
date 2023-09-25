package collection_list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

class Books{
	int pid;
	String title;
	double price;
	Books(){}
	public Books(int pid, String title, double price) {
		super();
		this.pid = pid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [pid=" + pid + ", title=" + title + ", price=" + price + "]";
	}
	
}
public class DriverBook {
	public static void main(String[] args) {
		ArrayList<Books> al=new ArrayList<>();
		al.add(new Books(102,"Manual",250));
		al.add(new Books(103,"Java",320));
		al.add(new Books(105,"Sql",220));
		al.add(new Books(106,"Selenium",300));
		System.out.println(al);
		System.out.println(al.size());
		System.out.println("********************************");
		
	     ListIterator<Books> li=al.listIterator(); 
	     //add a new book if the price is 250.
	     while (li.hasNext()) {
			Books b=li.next();
			if (b.price==250) {
				li.add(new Books(107,"API",150));
			}
		}
	     System.out.println(al);
	     System.out.println("********************************");
	     //remove a book if the title of the book is Java.
	     while (li.hasPrevious()) {
			Books b=li.previous();
			if (b.title.equalsIgnoreCase("java")) {
				li.remove();
			}
		}
	     System.out.println(al);
	     System.out.println("********************************");
	     //if the product id of book is 103 then modify 108
	     while (li.hasNext()) {
			Books b=li.next();
			if (b.pid==103) {
				li.set(new Books(108,"Java",320));
			}
		}
	     System.out.println(al);
	     System.out.println("********************************");
	}
	
}
