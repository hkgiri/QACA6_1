package twoDimensionalArrays;

import java.util.Scanner;

//wajp to print the even elements present in a two dimension integer Arrays.
public class PrintEvenNumber {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter The Numbers Of Rows");
		int row=sc.nextInt();
		System.out.println("Enter The Numbers of Columns");
		int col=sc.nextInt();
		int[][]a=new int[row][col];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				System.out.println("Enter The Elements in the Arrays "+(i+1)+" Rows");
				a[i][j]=sc.nextInt();
			}
		}
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				if (a[i][j]%2==0) {
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
