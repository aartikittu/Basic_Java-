package aggregation;

import java.util.Scanner;

public class CabDriver {
		
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Cab details");
		System.out.println("Enter cab number");
		String cab_no=sc.next();
		System.out.println("Enter driver name");
		String driver_name=sc.next();
		System.out.println("Enter dl no");
		String dl_no=sc.next();
		Cab c=new Cab(cab_no,driver_name,dl_no);
		System.out.println("Cab details are as follow");
		c.cabDetails();
		
		System.out.println("Enter Uber details");
		System.out.println("Enter Uber area: ");
		String uber_area=sc.next();
		System.out.println("Enter registration number ");
		String reg_no=sc.next();
		c.regCab(new Uber(uber_area,reg_no));
		System.out.println("Uber details are as follow");
		c.u.uberDetails();
	}

}
