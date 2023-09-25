package arraysProgram;
//wajp to find the largest element present inside an Integer Array.
public class FindTheLargeNumber {
	public static void main(String[] args) {
		int[] a= {10,20,30,15,35};
		int large=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large) {
				large=a[i];
			}
		}
		System.out.println("largest Element in the array is-->"+large);
	}
}
