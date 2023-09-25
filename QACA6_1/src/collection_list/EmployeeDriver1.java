package collection_list;

import java.util.ArrayList;
import java.util.ListIterator;

//perform all the operation by creating own method of add/remove & update.
class Employee1
{
	int eid;
	String name;
	double sal;
	String degi;
	double comm;
	Employee1(){}
	public Employee1(int eid, String name, double sal, String degi, double comm) {
		super();
		this.eid = eid;
		this.name = name;
		this.sal = sal;
		this.degi = degi;
		this.comm = comm;
	}
	@Override
	public String toString() {
		return "Employee1 [eid=" + eid + ", name=" + name + ", sal=" + sal + ", degi=" + degi + ", comm=" + comm + "]";
	}


}
public class EmployeeDriver1 {
	public static ArrayList addEmp()
	{
		ArrayList ls=new ArrayList();
		ls.add(new Employee(101,"Hemant Kumar",85000,"Manager",18000));
		ls.add(new Employee(102,"Ranjit Kumar",55000,"HR",6000));
		ls.add(new Employee(103,"Sandeep Kumar",45000,"Developer",6000));
		ls.add(new Employee(104,"Gaurav Kumar",55000,"TestEngginer",5000));
		System.out.println(ls);

		ListIterator<Employee> li=ls.listIterator();
		System.out.println("Manager add the Employee");
		while (li.hasNext()) {
			Employee e=li.next();
			if (e.degi.equalsIgnoreCase("Manager")) {
				li.add(new Employee(105,"Nikhil Kumar",25000,"TestEngginer",4500));
			}

		}
		System.out.println(ls);

		return ls;
	}
	public static ArrayList removeEmp()
	{
		ArrayList ls=new ArrayList();
		ls.add(new Employee(101,"Hemant Kumar",85000,"Manager",18000));
		ls.add(new Employee(102,"Ranjit Kumar",55000,"HR",6000));
		ls.add(new Employee(103,"Sandeep Kumar",45000,"Developer",6000));
		ls.add(new Employee(104,"Gaurav Kumar",55000,"TestEngginer",5000));
		System.out.println(ls);

		ListIterator<Employee> li=ls.listIterator();
		System.out.println("Manager remove the Employee ");
		while (li.hasNext()) {
		Employee e=li.next();
		if (e.degi.equalsIgnoreCase("Manager")) {
			
			}
		}
		return ls;
	}
		public static void main(String[] args) {


			addEmp();
			removeEmp();
			updateEmp();

		}
		public static ArrayList updateEmp()
		{
			ArrayList ls=new ArrayList();
			ls.add(new Employee(101,"Hemant Kumar",85000,"Manager",18000));
			ls.add(new Employee(102,"Ranjit Kumar",55000,"HR",6000));
			ls.add(new Employee(103,"Sandeep Kumar",45000,"Developer",6000));
			ls.add(new Employee(104,"Gaurav Kumar",28000,"TestEngginer",5000));
			System.out.println(ls);
			
			ListIterator<Employee> li=ls.listIterator();
			System.out.println("Update salary of the Employee whose Salary lessthan 30000. ");
			while (li.hasNext()) {
				Employee e=li.next();
				if (e.sal<30000) {
					li.set(new Employee(104,"Gaurav Kumar",38000,"TestEngginer",5000));
				}
			}
			System.out.println(ls);
			return ls;

			
		}
	}
