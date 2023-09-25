package collection_list;
/*
 Q- wajp to add at least 4 Book into a List & perform the following using the required accessing way.
  1. add anew book if the price of book is 250.
  2. remove a book if the title of book is java.
  3. If the product id of book is 103 modify to 108. 
 */

import java.util.*;

class Book
{
	int bid;
	String title;
	double price;
	Book(){}
	public Book(int bid, String title, double price) {
		super();
		this.bid = bid;
		this.title = title;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Book [bid=" + bid + ", title=" + title + ", price=" + price + "]";
	}
	
}
public class BookDriver_Listiterator {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Book(101,"Manual",450));
		ls.add(new Book(102,"java",550));
		ls.add(new Book(103,"SQL",250));
		System.out.println(ls);
		
		//to listiterator method
		ListIterator<Book> li=ls.listIterator();
		
		//add a new book if the price of book is 250.
		System.out.println("create a new Book object");
		while(li.hasNext())
		{
			Book b=li.next();
			if (b.price==250) {
				li.add(new Book(104,"API",220));
			}
		}
		System.out.println(ls);
		
		//remove a book if the title of book is java
		System.out.println("remove the BOOK object is java");
		while(li.hasPrevious())
		{
			Book b=li.previous();
			if (b.title.equalsIgnoreCase("java")) {
				li.remove();
			}
		}
		System.out.println(ls);
		
		//If the bid of book is 103 modify to 108
		System.out.println("bid is modify to 108");
		while(li.hasNext())
		{
			Book b=li.next();
			if (b.bid==103) {
				li.set(new Book(108,"SQL",250));
			}
		}
		System.out.println(ls);
		
	}
	
	
}
