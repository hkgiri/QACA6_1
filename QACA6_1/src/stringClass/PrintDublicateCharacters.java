package stringClass;
//wajp to print the repeated and duplicate characters present in a String.
public class PrintDublicateCharacters {
	public static void main(String[] args) {
		String s="aaabbcdeefg";
		char[]ch=s.toCharArray();
		String s1="";
		boolean[]b=new boolean[ch.length];
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			if (b[i]==false) {
				for (int j = i+1; j < ch.length; j++) {
					if (ch[i]==ch[j]) {
						b[j]=true;
						count++;
					}
				}
				if (count!=0) {
					s1=s1+ch[i];
				}
			}
		}
		System.out.println(s1);
	}
}
