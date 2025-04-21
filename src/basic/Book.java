package basic;

import java.util.Scanner;

public class Book 
{
	String bname;
	int bid; 
	int no_of_pages;
	int price;
	
	Book(String bname)
	{
		this.bname=bname;
	}
	Book(String bname, int bid)
	{
		this(bname);
		this.bid=bid;
	}
	Book(String bname, int bid, int no_of_pages)
	{
		this(bname, bid);
		this.no_of_pages=no_of_pages;
		
	}
	Book(String bname, int bid, int no_of_pages, int price)
	{
		this(bname, bid, no_of_pages);
		this.price=price;
	}
	public void display()
	{
		System.out.println("Book name "+bname);
		System.out.println("Book id "+ bid);
		System.out.println("No of pages "+ no_of_pages);
		System.out.println("Price "+price);
	}
	public static void main(String args[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		String bname=sc.nextLine();
		System.out.println("Enter book id");
		int bid=sc.nextInt();
		System.out.println("Enter number of pages");
		int no_of_pages=sc.nextInt();	
		System.out.println("Enter book price");
		int price=sc.nextInt();
		Book b=new Book(bname);
		b.display();
		Book b1=new Book(bname, bid);
		b1.display();
		Book b2=new Book(bname, bid, no_of_pages);
		b2.display();
		Book b3=new Book(bname,bid, no_of_pages, price);
		b3.display();
				
	}
	
	
	
	
}
