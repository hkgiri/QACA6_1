package collection_list;

import java.util.ArrayList;

//wajp to add 1 to 100 prime number into the collection
public class PrimeNumbers {
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		for (int i = 1; i <=100;i++) {
			int n=i;
			int k=2;
			int count=0;
			while (k<=n/2) {
				if (n%k==0) {
					count++;
					break;
				}
				k++;
			}
			if (count==0&&n!=1) {
				al.add(n);
			}
		}
		for (Object o : al) {
			System.out.println(o);
		}
	}
}
