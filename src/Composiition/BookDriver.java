package Composiition;

import java.util.Scanner;

public class BookDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter book name");
		String bname=sc.next();
		System.out.println("Enter book id");
		int bid=sc.nextInt();
		System.out.println("Enter book price");
		int price=sc.nextInt();
		System.out.println("Enter author");
		String author=sc.next();
		System.out.println("Enter page title");
		String page_title=sc.next();
		System.out.println("Enter page number");
		int page_no=sc.nextInt();
		Book1 b=new Book1(bname,bid,price,author,new Page(page_title,page_no));
		System.out.println("******Book Details********");
		b.bookDetails();
		System.out.println("******Page Detais********");
		b.p.pageDetails();
	
	}

}
