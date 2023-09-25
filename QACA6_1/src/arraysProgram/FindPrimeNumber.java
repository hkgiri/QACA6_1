package arraysProgram;

import java.util.Scanner;

//wajp to find the PrimeNumber or not with design the isprime or not, give the number from the user.
public class FindPrimeNumber {
	public static boolean isPrime(int n) {
		int i=2;
		while (i<=n/2) {
			if (n%i==0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Size of Elements");
		int size=sc.nextInt();
		int[] a=new int[size];
		System.out.println("Enter the "+size+" Numbers");
		for (int i = 0; i < a.length; i++) {
			a[i]=sc.nextInt();
		}
		System.out.println("The Prime Number are");
		for (int i = 0; i < a.length; i++) {
			boolean res=isPrime(a[i]);
			if (res) {
				System.out.println(a[i]);
			}
		}
	}
}
