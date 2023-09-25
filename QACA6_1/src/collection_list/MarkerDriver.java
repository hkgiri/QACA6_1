package collection_list;

import java.util.ArrayList;
import java.util.Collections;

class Marker implements Comparable
{
	int mid;
	String color;
	double price;
	Marker(){}
	public Marker(int mid, String color, double price) {
		super();
		this.mid = mid;
		this.color = color;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Marker [mid=" + mid + ", color=" + color + ", price=" + price + "]";
	}
	@Override
	public int compareTo(Object o) {
		Marker m=(Marker)o;
		if(this.mid>m.mid)
		return 1;
		else if(this.mid<m.mid)
		return -1;
		else
		return 0;
	}
}
public class MarkerDriver {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Marker(101,"Black",25));
		ls.add(new Marker(103,"Red",15));
		ls.add(new Marker(102,"Blue",20));
		ls.add(new Marker(104,"Green",10));
		System.out.println(ls);
		//to sort the marker mid
		Collections.sort(ls);
		System.out.println(ls);
	}
}	
