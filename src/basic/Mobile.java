package basic;

import java.util.Scanner;

public class Mobile {

	String brand;
	String color;
	int ram;
	double price;
	
	public Mobile(String brand)
	{
		this.brand=brand;
	}
	public Mobile(String brand, String color)
	{
		this(brand);
		this.color=color;
	}
	public Mobile(String brand, String color, int ram)
	{
		this(brand, color);
		this.ram=ram;
	}
	public Mobile(String brand, String color, int ram,double price)
	{
		this(brand, color, ram);
		this.price=price;
	}
	public void display()
	{
		System.out.println("Mobile details are as follow---->");
		System.out.println("Brand name: "+brand);
		System.out.println("Mobile color "+color);
		System.out.println("Mobile ram "+ ram);
		System.out.println("Mobile price "+price);
	}
	public static void main(String[] args) 
	{
		Scanner	sc=new Scanner(System.in);
		System.out.println("Enter mobile brand");
		String brand=sc.nextLine();
		System.out.println("Enter mobile color");
		String color=sc.nextLine();
		System.out.println("Enter mobile ram");
		int ram=sc.nextInt();
		System.out.println("Enter price");
		double price=sc.nextDouble();
		
		Mobile m=new Mobile(brand);
		m.display();
		Mobile m1=new Mobile(brand,color);
		m1.display();
		Mobile m2=new Mobile(brand,color,ram);
		m2.display();
		Mobile m3=new Mobile(brand,color,ram,price);
		m3.display();



	}

}
