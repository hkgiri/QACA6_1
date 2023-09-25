package stringClass;

import java.util.Scanner;

//wajp to convert the uppercase alphabet into lower case alphabet and vice versa. 
public class S5 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Strings");
		String s=sc.nextLine();
		char[] ch = s.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if (ch[i]>='A'&&ch[i]<='Z') {
				ch[i]+=32;
			}
			else if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]-=32;
			}
			else if(ch[i]==' ') {
				ch[i]=ch[i];
			}
		}
		String s1=new String(ch);
		System.out.println("Print the Vice Versa Alphabet "+s1);
	}
}
