package stringClass;

import java.util.Scanner;

//wajp to find the sum of digit in a String.
public class SumOfDigitInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Strings With Number");
		String s=sc.nextLine();
		char[] ch=s.toCharArray();
		int sum=0;
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='0'&&ch[i]<='9') {
				sum=sum+(ch[i]-48);
			}
		}
		System.out.println("Sum of the Number in given String "+sum);
	}
}
