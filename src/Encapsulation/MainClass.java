package Encapsulation;

import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		Bank b=new Bank();
		System.out.println("Bank name= "+b.get_bankName());
		System.out.println("Enter manager name");
		String manager_name=sc.next();
		b.set_managerName(manager_name);
		System.out.println("Manager Name "+b.get_managerName());
		System.out.println("Enter branch name ");
		String branch=sc.next();
		b.set_branch(branch);
		System.out.println("Branch name= "+b.get_branch());
		System.out.println("HEad Office= "+b.get_headOffice());
	}

}
