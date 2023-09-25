package arraysProgram;

import java.util.Arrays;

//write a java program to sort half of the Array Elements.
public class SortingInSecondHalf {
	public static void main(String[] args) {
		int[]a= {10,4,8,6,7,9,1};
		int size=a.length;
		System.out.println("Before Sorting Array");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a,size/2,size);
		System.out.println();
		System.out.println("Sort the in middle to end of the Elements");
		for (int i = 0; i < size; i++) {
			System.out.print(a[i]+" ");
		}
		Arrays.sort(a, 0,size/2);
		System.out.println();
		System.out.println("Sort the in starting to middle of the Elements");
		for (int i = 0; i <size; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
