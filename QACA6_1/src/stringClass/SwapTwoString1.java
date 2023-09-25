package stringClass;

import java.util.Scanner;

//wajp to swap two String without using extra contain like temp
public class SwapTwoString1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Two String");
		String s1=sc.nextLine();
		String s2=sc.nextLine();
		System.out.println("Before Swapping");
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		s1=s1+s2;
		s2=s1.substring(0,s1.length()-s2.length());
		s1=s1.substring(s2.length());
		System.out.println("s1 :"+s1);
		System.out.println("s2 :"+s2);
		
	}
}
