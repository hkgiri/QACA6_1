package arraysProgram;
//wajp to find the sum of the even index present in the Array.
public class Ass4 {
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50,60};
		int sum=0;
		for (int i = 0; i < a.length; i++) {
			if (i%2==0) {
				sum=sum+a[i];
			}
		}
		System.out.println("the sum of the even index is "+sum);
	}

}
