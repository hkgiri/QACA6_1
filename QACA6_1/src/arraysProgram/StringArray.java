package arraysProgram;

import java.util.Scanner;

//wajp to create a StringArray and read five names and store it in thet array and print it.
public class StringArray {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the Name");
		int size=sc.nextInt();
		String[] s=new String[size];
		System.out.println("Enter the "+size+" names");
		sc.nextLine();
		for (int i = 0; i < s.length; i++) {
			s[i]=sc.nextLine();
		}
		System.out.println("Print the all Names");
		for (int i = 0; i < s.length; i++) {
			System.out.println(s[i]);
		}
	}
}
