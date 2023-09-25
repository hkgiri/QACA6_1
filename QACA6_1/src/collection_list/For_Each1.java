package collection_list;
//wajp to print all the name element in arrays in Upper Case. 
public class For_Each1 {
	public static void main(String[] args) {
		String[] s= {"Apple","Mango","Banana","Orange"};
		for (String s1 : s) {
			System.out.println(s1+" it's UpperCase is:- "+s1.toUpperCase());
		}
	}
}
