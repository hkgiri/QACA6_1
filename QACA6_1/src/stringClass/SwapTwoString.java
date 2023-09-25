package stringClass;

import java.util.Scanner;

//wajp to swap two String.
public class SwapTwoString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two String");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Before Swapping");
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
		String temp=s1;
		s1=s2;
		s2=temp;
		System.out.println("After Swapping");
		System.out.println("S1 :"+s1);
		System.out.println("S2 :"+s2);
	}
}
