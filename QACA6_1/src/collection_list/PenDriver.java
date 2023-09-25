package collection_list;
/*wajp to add 4 pen object with following states. 1-product id,2-Brand,3-Price,Print Price of all  
  the element such that it should increase by 20% to the original price.
 */
import java.util.ArrayList;

class Pen{
	int pid;
	String brand;
	double price;
	Pen(){}
	public Pen(int pid, String brand, double price) {
		super();
		this.pid = pid;
		this.brand = brand;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Pen [pid=" + pid + ", brand=" + brand + ", price=" + (price+(price*20/100)) + "]";
	}
	
}
public class PenDriver {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(new Pen(101,"Cello",10));
		al.add(new Pen(102,"Link",15));
		al.add(new Pen(103,"Doms",4));
		al.add(new Pen(104,"totem",6));
		System.out.println(al);
		
	}
	
}
