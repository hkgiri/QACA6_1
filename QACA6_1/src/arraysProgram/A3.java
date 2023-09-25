package arraysProgram;
//wajp to find the sum of the Elements present in the Integer Array.
public class A3 {
	public static void main(String[] args) {
		int[] a= {15,25,10,30};
		int sum=0;
	for (int i = 0; i < a.length; i++) {
		sum=sum+a[i];
	}
	System.out.println("Sum of the Array is --> "+sum);
	}
}
