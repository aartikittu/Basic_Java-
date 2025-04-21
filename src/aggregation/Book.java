package aggregation;

public class Book 
{
	String book_name;
	int book_id;
	int price;
	
	public Book(String book_name, int book_id, int price)
	{
		this.book_name=book_name;
		this.book_id=book_id;
		this.price=price;
	}
	public void bookDetails()
	{
		System.out.println("Book details are as follow----->");
		System.out.println("Book name is: "+book_name);
		System.out.println("Book id: "+book_id);
		System.out.println("Book price: "+price);
	}
}
