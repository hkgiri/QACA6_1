package arraysProgram;

import java.util.Scanner;

//wajp to read the n Element from the user and storing int container and print all the Elemen.
public class A2 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number of Elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the "+size+" Elements");
		for (int i = 0; i < size; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("print All Entered Elements");
		for (int i = 0; i <size; i++) {
			System.out.println(a[i]);
		}
	}
}
