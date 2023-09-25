package collection_list;

import java.util.ArrayList;
import java.util.Iterator;

//wajp to add at least 4 laptops into a collection and remove a collection whose price 50999.using iterator() 
class Laptop
{
	int lid;
	String brand;
	double price;
	Laptop(){}
	public Laptop(int lid, String brand, double price) {
		super();
		this.lid = lid;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Laptop [lid=" + lid + ", brand=" + brand + ", price=" + price + "]";
	}
	
}
public class LaptopDriver_ITE {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Laptop(101,"Dell",49999));
		ls.add(new Laptop(102,"hp",50999));
		ls.add(new Laptop(103,"Apple",80999));
		ls.add(new Laptop(104,"Lenavo",60999));
		System.out.println("Before removing "+ls);
		
		//to Remove a Laptop Object Price.
		Iterator<Laptop> i=ls.iterator();
		while(i.hasNext())
		{
			Laptop l=i.next();
			if (l.price==50999) {
				i.remove();
			}
			
		}
		System.out.println(ls);
	}
}
