package collection_list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
class SortbyBrand implements Comparator<Bat>
{
	@Override
	public int compare(Bat o1, Bat o2) {
		
		return o1.brand.compareTo(o2.brand);
	}
}
class Sortbybid implements Comparator<Bat>
{
	@Override
	public int compare(Bat o1, Bat o2) {
		if(o1.bid>o2.bid)
		return 1;
		else if(o1.bid<o2.bid)
		return -1;
		else
		return 0;
	}
}
	class SortbyPrice implements Comparator<Bat>
	{
		    @Override
		    public int compare(Bat o1, Bat o2) {
			if(o1.price>o2.price)
			return 1;
			else if(o1.price<o2.price)
			return -1;
			else
			return 0;
		}
}
class Bat
{
	int bid;
	String brand;
	double price;
	Bat(){}
	public Bat(int bid, String brand, double price) {
		super();
		this.bid = bid;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Bat [bid=" + bid + ", brand=" + brand + ", price=" + price + "]";
	}
	
	
	
}
public class BatDriver {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Bat(101,",MRF",7500));
		ls.add(new Bat(108,",CEAT",5500));
		ls.add(new Bat(104,",REBOOK",8500));
		ls.add(new Bat(109,",TON",7600));
		System.out.println(ls);
		System.out.println("*****************************");
		
		//to sort the collection of Brand
		Collections.sort(ls,new SortbyBrand());
		System.out.println(" sorting based on brand");
		for (Object obj : ls) {
			System.out.println(obj);
		}
		System.out.println("*****************************");
		//to sort the collection of Bat id
		Collections.sort(ls,new Sortbybid());
		System.out.println(" sorting based on bat id");
		for (Object obj : ls) {
			System.out.println(obj);
		}
		System.out.println("*****************************");
		//to sort the collection of Bat price
		Collections.sort(ls,new SortbyPrice());
		System.out.println(" sorting based on bat price");
		for (Object obj : ls) {
		System.out.println(obj);
		}
		System.out.println("*****************************");
	}
}	
