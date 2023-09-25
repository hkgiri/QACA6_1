package stringClass;

import java.util.Scanner;

/*wajp to validate a password rules is:-
 1.password should contains 8-15 charecters.
 2.it should contain 1 uppercase.
 3.it should contain 1 lowercase.
 4.it should contain not have a space.
 5.it should have a digit.
 6.it should have special charecters like--> $ # @ !
 */
public class ValidatePassword {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Password");
		String s=sc.nextLine();
		char[] ch = s.toCharArray();
		int upper=0;
		int low=0;
		int spec=0;
		int space=0;
		int digit=0;
		if (s.length()>=8&&s.length()<=15) {
			for (int i = 0; i < ch.length; i++) {
				char c=ch[i];
				if (c>='A'&&c<='Z') {
					upper++;
				}
				else if(c>='a'&&c<='z') {
					low++;
				}
				else if(c>='0'&&c<='9') {
					digit++;
				}
				else if(c==' ') {
					space++;
				}
				else if(c=='@'||c=='#'||c=='$'||c=='!') {
					spec++;
				}
			}
			if (upper>=1&&low>1&&digit>=1&&space==0&&spec>=1) {
				System.out.println("correct Password");
			}
			else {
				System.out.println("Incorrect Password");
				System.err.println("Please Check your password ");
			}
		}
		else {
			System.out.println("Incorrect Password");
			System.err.println("It should have 8 to 15 characters");
		}
	}
}
