package collection_list;

public class LibraryDriver {
	public static void main(String[] args) {
		Library li=new Library();
		li.addBook(new Book1(1,"Manual",350));
		li.addBook(new Book1(2,"SQL",250));
		li.addBook(new Book1(3,"Java",650));
		li.addBook(new Book1(4,"Selenium",550));
		li.addBook(new Book1(5,"API",200));
		int size=li.al.size();
		System.out.println(size);
		System.out.println("without removing Book");
		for (int i = 0; i < li.al.size(); i++) {
			System.out.println(li.al.get(i)); 
		}
		li.removeBook(5);
		System.out.println("Book removing by bid is 5");
		for (int i = 0; i < li.al.size(); i++) {
			System.out.println(li.al.get(i)); 
		}
		li.removeBook("manual");
		System.out.println("Book removing by name is manual");
		for (int i = 0; i < li.al.size(); i++) {
			System.out.println(li.al.get(i)); 
		}
		li.removeBook(250.0);
		System.out.println("Book removing by price is 250");
		for (int i = 0; i < li.al.size(); i++) {
			System.out.println(li.al.get(i)); 
		}
		
	}
}
