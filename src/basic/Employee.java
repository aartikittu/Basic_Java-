package basic;

import java.util.Scanner;

public class Employee 
{
	String ename;
	int eid;
	int cno;
	String pan;
	
	public Employee(String ename)
	{
		this.ename=ename;
	}
	public Employee(String ename, int eid)
	{
		this(ename);
		this.eid=eid;
	}
	public Employee(String ename, int eid, int cno)
	{
		this(ename, eid);
		this.cno=cno;
	}
	public Employee(String ename, int eid, int cno, String pan)
	{
		this(ename, eid, cno);
		this.pan=pan;
	}
	public void display()
	{
		System.out.println("Employee details are as follow"); 
		System.out.println("Employee name= "+ ename);
		System.out.println("Employee id- "+eid);
		System.out.println("Employee Customer number= "+cno);
		System.out.println("Employee pan number= "+pan);
	}
	
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Employee details");
		System.out.println("Enter Employee name");
		String ename=sc.nextLine();
		System.out.println("Enter employee id");
		int eid=sc.nextInt();
		System.out.println("Enter customer number");
		int cno=sc.nextInt();
		System.out.println("Enter pan number");
		String pan=sc.next();
		
		Employee emp=new Employee(ename);
		emp.display();
		
		Employee emp1=new Employee(ename,eid);
		emp1.display();
		
		Employee emp2=new Employee(ename,eid,cno);
		emp2.display();

		Employee emp3=new Employee(ename,eid,cno,pan);
		emp3.display();

	}

}
