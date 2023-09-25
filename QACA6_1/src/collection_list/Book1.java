package collection_list;

public class Book1 {
	int bid;
	String name;
	double price;
	Book1(){}
	public Book1(int bid, String name, double price) {
		super();
		this.bid = bid;
		this.name = name;
		this.price = price;
	}
	public void display() {
		System.out.println("Details of Books");
		System.out.println("Book Name :"+name);
		System.out.println("Book Id   :"+bid);
		System.out.println("Book Price:"+price);
		System.out.println("**************************");
	}
	@Override
	public String toString() {
		return "Book1 [bid=" + bid + ", name=" + name + ", price=" + price + "]";
	}
	
}
