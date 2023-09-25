package stringClass;

import java.util.Scanner;

//wajp to remove the white space from String.
public class RemoveAllTheSpacesInString {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The String with Space");
		String s=sc.nextLine();
		String s1="";
		char[]ch=s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]!=' ') {
				s1=s1+ch[i];
			}
		} 
		System.out.println("print Removed Space "+s1);
	}
}
