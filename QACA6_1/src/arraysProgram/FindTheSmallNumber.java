package arraysProgram;
//wajp to find the largest element present inside an Integer Array.
public class FindTheSmallNumber {
	public static void main(String[] args) {
		int[] a= {10,50,70,48,98};
		int small=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<small) {
				small=a[i];
			}
		}
		System.out.println("the Smallest Number is-->"+small);
		
	}
}
