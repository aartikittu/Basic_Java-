package basic;

import java.util.Scanner;

public class MobileDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Mobile Details");
		System.out.println("Enter Mobile brand");
		String brand=sc.next();
		System.out.println("Enter ram");
		int ram=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		Mobile1 m=new Mobile1(brand,ram,price);
		m.mobileDetails();
		
		System.out.println("Enter Sim details");
		System.out.println("Enter sim no");
		int simNo=sc.nextInt();
		System.out.println("Enter sim provider");
		String sim_provider=sc.next();
		m.insertSim(new Sim(simNo, sim_provider));
		System.out.println("Sim ddetails");
		m.s.simDetails();
		
		
	}

}
