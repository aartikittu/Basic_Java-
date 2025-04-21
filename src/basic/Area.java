package basic;

import java.util.Scanner;

public class Area {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the radius of circle");
		int r=sc.nextInt();
		Area area=new Area();
		double val=area.ar(r);
		System.out.println("Area of circle is "+val);

	}
	public double ar(int r)
	{
		double ans=(double)22/7*r*r;
		return ans;
	}
	

}
