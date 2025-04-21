package aggregation;

import java.util.Scanner;

public class BagDriver {

	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Bag details\n");
		
		System.out.println("Enter color of bag");
		String color=sc.next();
		System.out.println("Enter bag price");
		int bag_price=sc.nextInt();
		Bag bag=new Bag(color,bag_price);
		
		bag.bagDetails();
		
		System.out.println("\nEnter book details\n");
		System.out.println("Enter book name");
		String book_name=sc.next();
		System.out.println("Enter Book id");
		int book_id=sc.nextInt();
		System.out.println("Enter price");
		int price=sc.nextInt();
		System.out.println("\nAdd Book!!!!!!!!!\n");
		bag.addBook(new Book(book_name,book_id,price));
		System.out.println("\nBook Added Successfully!!!!!!!!!\n"); 
		bag.b.bookDetails();

		System.out.println("\nRemove Book!!!!!!!\n");
		bag.removeBook();
		System.out.println("\nBook Removed Successfully!!!!!!!!!\n");
		
		
		
		
		
	}

}
