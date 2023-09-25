package arraysProgram;

public class BoobleSort {
	public static void main(String[] args) {
		int[]a= {10,2,7,19,40};
		System.out.println("Before Sorting");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		//sorting 
		for (int i = 0; i < a.length-1; i++) {
			for (int j = 0; j < a.length-1-i; j++) {
				if (a[j]>a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorting in Acending Order");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
		System.out.println();
		System.out.println("Sorting in Decending Order");
		for (int i = a.length-1; 0<=i; i--) {
			System.out.print(a[i]+" ");
		}
	}
}
