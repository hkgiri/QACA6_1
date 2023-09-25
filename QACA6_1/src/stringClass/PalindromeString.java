package stringClass;

import java.util.Iterator;
import java.util.Scanner;

//wajp to check whether the given String is a palindrome String or not.
public class PalindromeString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Strings");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		String rev="";
		for (int i = ch.length-1; i >=0; i--) {
			rev=rev+ch[i];
		}
		if (rev.equals(s)) {
			System.out.println("It is a Palindrome String");
		}
		else
			System.out.println("It is not a Palindrome String");
	}
}
