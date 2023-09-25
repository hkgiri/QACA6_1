package arraysProgram;

import java.util.Arrays;
//merge the two Elements Are same length.
public class MergeTheTwoArraysDeffrentIndex {
	public static void main(String[] args) {
		int[]a= {10,30,50,70,90};
		int[]b= {20,40,60,80,100};
		int[] res=new int[a.length+b.length];
		int i=0;
		int j=0;
		while(j<a.length&&j<b.length) {
			res[i]=a[j];
			i++;
			res[i]=b[j];
			i++;
			j++;
		}
		System.out.println("print Merged The Elements");
		for (int k = 0; k < res.length; k++) {
			System.out.print(res[k]+" ");
		}
	}
}
