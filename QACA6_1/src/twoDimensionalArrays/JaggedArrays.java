package twoDimensionalArrays;

import java.util.Scanner;

public class JaggedArrays {
	public static void main(String[] args) {
		int[][]a=new int[3][];
		Scanner sc=new Scanner(System.in);
		for (int i = 0; i < a.length; i++) {
			System.out.println("Enter The Number Of Columns for "+(i+1)+" Per Row");
			int size=sc.nextInt();
			a[i]=new int[size];
		}
		System.out.println("Print The Default Value ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println("Initilize The Value into The Arrays");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter The Elements in The Arrays "+(i+1)+" Rows");
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Print Entered Arrays");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
	}
}
