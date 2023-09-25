package stringClass;

import java.util.Scanner;
 
//wajp to convert all the Upper case characters into Lower case into a string without using inbuilt methods.
public class S4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Upper Case String");
		String s = sc.nextLine();
		char[] ch = s.toCharArray();
		String s1="";
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='A'&&ch[i]<='Z') {
			char s2 = ch[i]+=32;
			s1=s1+s2;
			}
			if (ch[i]==' ') {
				s1=s1+ch[i];
			}
		}
		System.out.println("Lower Case is --> "+s1);
	}
}
