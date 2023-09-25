package arraysProgram;
//merge the two Elements Are different length.
public class MergeTheTwoArraysDeffrentIndex1 {
	public static void main(String[] args) {
		int[]a= {10,30,50,70,90,100,110};
		int[]b= {20,40,60,80};
		int[] res=new int[a.length+b.length];
		int i=0;
		int j=0;
		while (j<a.length&&j<b.length) {
			res[i]=a[j];
			i++;
			res[i]=b[j];
			i++;
			j++;
		}
		while (j<a.length) {
			res[i]=a[j];
			i++;
			j++;
		}
		for (int k = 0; k < res.length; k++) {
			System.out.print(res[k]+" ");
		}
	}
}
