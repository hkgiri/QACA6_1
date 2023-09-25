package arraysProgram;

public class StudentDriver {
	public static void main(String[] args) {
		Student[] s=new Student[5];
		s[0]=new Student(10,"Hemant",24);
		s[1]=new Student(11,"Ambrish",29);
		s[2]=new Student(12,"Sandeep",27);
		s[3]=new Student(13,"Gaurav",28);
		s[4]=new Student(14,"Sachin",25);
		for (int i = 0; i < s.length; i++) {
			s[i].disstudent();
		}
	}
}
