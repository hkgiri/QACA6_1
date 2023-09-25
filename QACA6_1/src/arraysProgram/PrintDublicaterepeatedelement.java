package arraysProgram;
//write a java to print the dublicates elements in an Integer Array Repeated Elements.
public class PrintDublicaterepeatedelement {
	public static void main(String[] args) {
		int[]a= {10,20,30,20,30,15,60,70,10};
		boolean[]b=new boolean[a.length];
		for (int i = 0; i < a.length; i++) {
			int count=0;
			if (b[i]==false) {
				for (int j = i+1; j < a.length; j++) {
					if (a[i]==a[j]) {
						count++;
						b[j]=true;
					}
				}
				if (a[i]>count) {
					System.out.println(a[i]);
				}
			}
		}
	}
	

}
