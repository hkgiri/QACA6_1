package collection_list;
/* Q- wajp to add at least 10 employees into a list who has following states (eid,name,sal,designation,comm).
 	  perform the following operation using the required ways
 	1.print all the employee element total sal of all the employees
 	2.remove the employee who has common commission.
 	3.add an employee if employee designation is manager.
 	4.update the employee object commission to a value if it is null or zero.
 	5.perform all the operation by creating own method of add/remove & update. 
 */

import java.util.ArrayList;
import java.util.ListIterator;
class Employee
{
	int eid;
	String name;
	double sal;
	String degi;
	double comm;
	Employee(){}
	public Employee(int eid, String name, double sal, String degi, double comm) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.degi = degi;
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", name=" + name + ", sal=" + sal + ", degi=" + degi + ", comm=" + comm + "]";
	}

}
public class EmployeDriver {
	public static void main(String[] args) {
		ArrayList ls=new ArrayList();
		ls.add(new Employee(101,"Hemant Kumar",8000,"Manager",3000));
		ls.add(new Employee(102,"Ranjit Kumar",5000,"HR",2000));
		ls.add(new Employee(103,"Sandeep Kumar",4000,"Developer",800));
		ls.add(new Employee(104,"Gaurav Kumar",4500,"TestEngginer",800));
		ls.add(new Employee(104,"Ranjan Kumar",3000,"Analyst",1000));
		ls.add(new Employee(104,"Praveen Kumar",2500,"TestEngginer",0));
		ls.add(new Employee(104,"Santosh Kumar",2000,"Analyst",200));
		ls.add(new Employee(104,"Sujit Kumar",2200,"Clerk",300));
		ls.add(new Employee(104,"Dilip Kumar",2400,"Analyst",200));
		ls.add(new Employee(104,"Rishi Kumar",1500,"Clerk",500));
		System.out.println(ls);

		ListIterator<Employee> li=ls.listIterator();

		// to add the all total sal of the Employee.
		while(li.hasNext())
		{
			Employee e=li.next();
			Double d=e.sal+e.comm;
			System.out.println(e);
			System.out.println("Total Salary of Employee's: "+d);
		}
		// remove the employee who has common commission.
		//Double d=1.5;
		/*while(li.hasPrevious())
		{
			Employee e=li.previous();
			if (e.comm==) 
			{
				li.remove();
			}
			
		}*/
		System.out.println(ls);
		
		//add an employee if employee designation is manager.
		System.out.println("Manager add the new Employee");
		while(li.hasPrevious())
		{
			Employee e=li.previous();
			if (e.degi=="Manager") {
				li.add(new Employee(105,"Kiran Kumar",35000,"Developer",0.0));
			}
			System.out.println(e);
		}
	
		//update the employee object commission to a value if it is null or zero.
		System.out.println("Update the employe commission");
		while (li.hasNext()) {
			Employee e=li.next();
			if (e.comm<=0) {
				li.set(new Employee(105,"Kiran Kumar",35000,"Developer",4000));
			}
			
		}
		System.out.println(ls);
		//perform all the operation by creating own method of add/remove & update.
		
	}	
}
