package stringClass;
//wajp to convert the reverse String in given Array.
public class S1 {
	public static void main(String[] args) {
		String s="Hello";
		String s1="";
		char[] ch = s.toCharArray();
		for (int i = ch.length-1; i>=0; i--) {
			s1=s1+ch[i];
		}
		System.out.println(s1);
	}
}
