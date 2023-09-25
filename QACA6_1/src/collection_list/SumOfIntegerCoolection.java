package collection_list;

import java.util.ArrayList;
import java.util.Scanner;

//wajp to add 10 Integer numbers into the collection and find out the sum element present inside the collection read the element from the user. 
public class SumOfIntegerCoolection {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		ArrayList al=new ArrayList();
		System.out.println("Enter the 10 Integer Number");
		for (int i = 1; i <=10; i++) {
			int n=sc.nextInt();
			al.add(n);
		}
		int sum=0;
		for (int i = 0; i < al.size(); i++) {
			Object o = al.get(i);
			Integer i1=(Integer)o;
			int a=i1;
			sum=sum+a;
		}
		System.out.println("Total Sum of the Integer: "+sum);
	}
}
