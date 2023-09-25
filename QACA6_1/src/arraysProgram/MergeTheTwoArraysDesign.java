package arraysProgram;

import java.util.Scanner;

public class MergeTheTwoArraysDesign {
	public static void main(String[] args) {
		int[]a=toRead();
		int[]b=toRead();
		int[] res=toMerge(a,b);
		System.out.println("Print all the Merge Numbers");
		for (int i = 0; i < res.length; i++) {
			System.out.println(res[i]);
		}
		
		
	}
	public static int[] toRead() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Elements");
		int size=sc.nextInt();
		int[]a=new int[size];
		System.out.println("Enter the "+size+" Numbers");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		return a;
	}
	public static int[] toMerge(int[] a,int[] b) {
		int[]res=new int[a.length+b.length];
		for (int i = 0; i < a.length; i++) {
			res[i]=a[i];
		}
		for (int i = 0; i < b.length; i++) {
			res[a.length+i]=b[i];
		}
		return res;
	}
}
