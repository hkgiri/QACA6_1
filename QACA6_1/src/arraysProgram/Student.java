package arraysProgram;
/*design a blue print of student object with states like- sid, sname ,age, and create 
  one method to display of student. create a container to store five student objects 
  in the display the details of the student.
 */
public class Student {
	int sid;
	String sname;
	int age;
	public Student() {}
	public Student(int sid, String sname, int age) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.age = age;
	}


	public void disstudent() {
		System.out.println("Student Id: "+sid);
		System.out.println("Student Name: "+sname);
		System.out.println("Student Age: "+age);
		System.err.println("**********************");
	}
}
