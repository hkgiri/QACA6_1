package arraysProgram;

public class FindTheSecondLargestNumber {
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,45};
		int large1=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]>large1) {
				large1=a[i];
			}
		}
		int large2=a[0];
		for (int i = 0; i < a.length; i++) {
			if (a[i]<large1) {
			large2=a[i];	
			}
		}
		System.out.println("Second Largest Number is-->"+large2);
	}
}
