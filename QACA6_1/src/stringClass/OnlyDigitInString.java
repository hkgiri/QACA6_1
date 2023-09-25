package stringClass;

import java.util.Scanner;

//wajp to check whether the String contains only digit.
public class OnlyDigitInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String");
		String s=sc.nextLine();
		try {
			Integer.parseInt(s);
			System.out.println("Only Digit in a String");
			
		} catch (Exception e) {
			System.out.println("Not only Digit in a String");
		}
	}

}
