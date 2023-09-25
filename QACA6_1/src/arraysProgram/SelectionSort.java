package arraysProgram;

public class SelectionSort {
	public static void main(String[] args) {
		int[]a= {10,5,8,20,4,6};
		System.out.println("Before Sorting");
		for(int i=0;i<a.length;i++) {
			System.out.print(a[i]+" ");
		}
		//Selection Sort
		for (int i = 0; i < a.length-1; i++) {
			int pass=i;
			for (int j = i+1; j < a.length; j++) {
				if (a[pass]>a[j]) {
					pass=j;
				}
			}
			if (pass!=i) {
				int temp=a[i];
				a[i]=a[pass];
				a[pass]=temp;
			}
		}
		System.out.println();
		System.out.println("After Sort");
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i]+" ");
		}
	}
}
