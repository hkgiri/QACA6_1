package stringClass;
//wajp to convert all the lower case characters into upper case into a string without using inbuilt methods.
public class S3 {
	public static void main(String[] args) {
		String low="hello";
		char[] ch = low.toCharArray();
		for (int i = 0; i < ch.length; i++) {
			if(ch[i]>='a'&&ch[i]<='z') {
				ch[i]-=32;
			}
		}
		String upper=new String(ch);
		System.out.println(upper);
	}

}
