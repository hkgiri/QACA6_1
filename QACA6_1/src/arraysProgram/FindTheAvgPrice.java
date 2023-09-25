package arraysProgram;

import java.util.Scanner;

//wajp to read n product price from the users and storing it inside the container then find Average price.
public class FindTheAvgPrice {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of product price");
		int size=sc.nextInt();
		double sum=0;
		double[] d=new double[size];
		System.out.println("Enetr "+size+" Price in the Array");
		for (int i = 0; i < d.length; i++) {
			d[i]=sc.nextDouble();
			sum=sum+d[i];
		}
		double avg=sum/size;
		System.out.println("the average of Product price is "+avg);
		
	}
}
